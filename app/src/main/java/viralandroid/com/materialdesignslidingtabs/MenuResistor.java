package viralandroid.com.materialdesignslidingtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by HP on 4/4/2016.
 */

public class MenuResistor extends Fragment {
    public MenuResistor() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.menuresistor, container, false);

        Button kalkulator = (Button)v.findViewById(R.id.resistor);
        kalkulator.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kalkulator.class);
                startActivity(intent);
            }
        });
        Button warna = (Button)v.findViewById(R.id.warna);
        warna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), warna.class);
                startActivity(intent);
            }
        });

        return v;
    }
}