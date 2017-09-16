package viralandroid.com.materialdesignslidingtabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by vanhauten on 09/07/16.
 */
public class MenuGate extends Fragment {
    public MenuGate() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.menulogic, container, false);

        Button and = (Button)v.findViewById(R.id.and);
        and.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), submenuand.class);
                startActivity(intent);
            }
        });
        Button not = (Button)v.findViewById(R.id.not);
        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), submenunot.class);
                startActivity(intent);
            }
        });
        Button or = (Button)v.findViewById(R.id.or);
        or.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), submenuor.class);
                startActivity(intent);
            }
        });
        /*
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
        });*/
        return v;
    }

}
