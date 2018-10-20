package tw.dora.fragmenttest1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class F1 extends Fragment {
    private TextView lottery;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad","F1:onCreateView()");
        View view = inflater.inflate(R.layout.fragment_f1, container, false);

        Button btn = view.findViewById(R.id.f1_btn);
        lottery = view.findViewById(R.id.f1_lottery);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1btn();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("brad","F1:onAttach()");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad","F1:onDetach()");
    }

    public void f1btn() {
        Log.v("brad","F1:f1btn()");
        lottery.setText(""+(int)(Math.random()*49+1));
    }

}
