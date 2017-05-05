package com.example.thfad_000.myapplication;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by thfad_000 on 2017-04-11.
 */
public class Fragment_2 extends Fragment{

    Button btn;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("되나","안되나");
                Intent intent = new Intent(view.getContext(), VillageInfoActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
