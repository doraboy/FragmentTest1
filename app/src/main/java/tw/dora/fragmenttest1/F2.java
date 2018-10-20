package tw.dora.fragmenttest1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class F2 extends Fragment {
    private TextView mesg;
    private View mainView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad","F2:onCreateView()");
        mainView =  inflater.inflate(R.layout.fragment_f2, container, false);
        mesg = mainView.findViewById(R.id.f2_mesg);
        mainView.findViewById(R.id.f2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeF4Mesg();
            }
        });

        return mainView;
    }

    private void changeF4Mesg(){
        ((MainActivity)getActivity()).F2ChangeF4("Haha!"+(int)(Math.random()*49+1));

    }

    public void showCounter (String counter){
        if(mesg == null) return;
        mesg.setText(counter);
    }

}
