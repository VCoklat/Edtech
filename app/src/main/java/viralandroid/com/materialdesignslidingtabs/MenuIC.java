package viralandroid.com.materialdesignslidingtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by HP on 4/4/2016.
 */

public class MenuIC extends Fragment {
    ImageButton ic7408;
    public MenuIC() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.menuic, container, false);

        ImageButton newPage = (ImageButton)v.findViewById(R.id.ic7408);
        newPage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), subic7408.class);
                startActivity(intent);
            }
        });

        ImageButton ic7404 = (ImageButton)v.findViewById(R.id.ic7404);
        ic7404.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), subic7404.class);
                startActivity(intent);
            }
        });

        ImageButton ic74614 = (ImageButton)v.findViewById(R.id.ic74614);
        ic74614.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), subic74614.class);
                startActivity(intent);
            }
        });

        ImageButton icl293d = (ImageButton)v.findViewById(R.id.icl293d);
        icl293d.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), subicl293d.class);
                startActivity(intent);
            }
        });

        ImageButton ic555 = (ImageButton)v.findViewById(R.id.ic555);
        ic555.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), subic555.class);
                startActivity(intent);
            }
        });
        return v;

        
    }
}