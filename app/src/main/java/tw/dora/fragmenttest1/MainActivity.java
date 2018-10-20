package tw.dora.fragmenttest1;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private UIHandler uiHandler;
    private TextView title;

    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;

    private Timer timer;
    private int iCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = new Timer();
        uiHandler = new UIHandler();
        title = findViewById(R.id.main_title);

        f1 = new F1();
        f2 = new F2();
        f3 = new F3();
        f4 = new F4();

        fmgr = getSupportFragmentManager();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container,f1);

        transaction.commit();

        timer.schedule(new MyTask(),0,1000);
    }

    public void F2ChangeF4(String mesg){
        f4.changeMesg(mesg);
    }

    public void setTitle(String newTitle){
        title.setText(newTitle);
    }

    private class MyTask extends TimerTask {
        @Override
        public void run() {
            iCounter++;
            uiHandler.sendEmptyMessage(0);
        }
    }

    private class UIHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            f2.showCounter("From Main: " + iCounter);
        }
    }


    @Override
    public void finish() {
        if(timer != null){
            timer.cancel();
            timer.purge();
            timer = null;
        }

        super.finish();
    }

    public void gotoPage1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container,f1);
        transaction.commit();
    }

    public void gotoPage2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container,f2);
        transaction.commit();


    }

    public void gotoPage3(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container,f3);
        transaction.commit();
    }

    public void gotoPage4(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container,f4);
        transaction.commit();
    }


}
