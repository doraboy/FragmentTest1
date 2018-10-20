package tw.dora.fragmenttest1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class F4 extends Fragment {
    private View mainView;
    private TextView mesg;
    private String value = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad","F4:onCreateView()");

        if(mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_f4, container, false);
        }
        mesg = mainView.findViewById(R.id.f4_mesg);
        mesg.setText(value);

        return mainView;
    }

    public void changeMesg(String mesg){
        value = mesg;
    }

}
