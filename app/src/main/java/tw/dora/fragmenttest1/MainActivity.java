package tw.dora.fragmenttest1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private F4 f4;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new F1();
        f2 = new F2();
        f3 = new F3();
        f4 = new F4();

        textView =findViewById(R.id.f1_lottery);

        fmgr = getSupportFragmentManager();

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container,f1);

        transaction.commit();


    }

//    public void f1btn(View view) {
//        Log.v("brad","Main:f1btn()");
//    }

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
