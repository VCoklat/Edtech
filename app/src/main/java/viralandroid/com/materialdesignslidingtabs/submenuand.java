package viralandroid.com.materialdesignslidingtabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vanhauten on 20/07/16.
 */
public class submenuand extends AppCompatActivity {
   int i,j=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenuand);
        final ImageView awal = (ImageView) findViewById(R.id.satu);
        final ImageView awal2 = (ImageView) findViewById(R.id.satu2);
        final ImageView akhir = (ImageView) findViewById(R.id.dua);
        final TextView text = (TextView) findViewById(R.id.hasil);
        final Button satu = (Button) findViewById(R.id.button1);
        satu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i == 0) {
                    awal.setImageResource(R.drawable.hidup);
                    akhir.setImageResource(R.drawable.mati);
                    satu.setText("HIGH");
                    if (j == 1) {
                        akhir.setImageResource(R.drawable.hidup);
                        text.setText("HIGH");
                    }
                    i = 1;
                } else {
                    awal.setImageResource(R.drawable.mati);
                        akhir.setImageResource(R.drawable.mati);
                        text.setText("LOW");
                    satu.setText("LOW");
                    i = 0;
                }
            }
        });
        final Button satu2 = (Button) findViewById(R.id.button2);
        satu2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (j == 0) {
                    awal2.setImageResource(R.drawable.hidup);
                    satu2.setText("HIGH");

                    if (i == 1) {
                        akhir.setImageResource(R.drawable.hidup);
                        text.setText("HIGH");
                    }
                    j = 1;
                } else {
                    akhir.setImageResource(R.drawable.mati);
                    text.setText("LOW");
                    awal2.setImageResource(R.drawable.mati);
                    satu2.setText("LOW");
                    j = 0;
                }
            }
        });
    }

}
