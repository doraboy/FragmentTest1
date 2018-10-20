package tw.dora.fragmenttest1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class F2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.v("brad","F2:onCreateView()");
        return inflater.inflate(R.layout.fragment_f2, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("brad","F2:onAttach()");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("brad","F2:onDetach()");
    }

}
