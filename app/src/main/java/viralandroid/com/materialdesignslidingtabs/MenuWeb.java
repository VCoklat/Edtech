package viralandroid.com.materialdesignslidingtabs;

/**
 * Created by vanhauten on 08/07/16.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MenuWeb extends Fragment {
    public MenuWeb() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.menuweb, container, false);

        ImageButton youtube = (ImageButton)v.findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=tjLsfU_b8x4&list=PLAZTGLBL-zgT9XyNkPcQd9cG5xNJUW6S1"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageButton learning = (ImageButton)v.findViewById(R.id.learning);
        learning.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drive.google.com/folderview?id=0Bz1H5rX0yVCxcDhCMFh3RGVhRXc&usp=sharing"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return v;
    }

}