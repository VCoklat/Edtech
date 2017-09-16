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
public class submenunot extends AppCompatActivity {
Button button;
    int i = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submenunot);
        final ImageView awal = (ImageView)findViewById(R.id.satu);
        final ImageView akhir = (ImageView)findViewById(R.id.dua);
        final TextView text = (TextView) findViewById(R.id.output);
        final Button not = (Button)findViewById(R.id.awal);
        not.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (i == 0)
                {
                    awal.setImageResource(R.drawable.hidup);
                    akhir.setImageResource(R.drawable.mati);
                    not.setText("HIGH");
                    text.setText("LOW");
                    i=1;
                }
                else
                {
                    akhir.setImageResource(R.drawable.hidup);
                    awal.setImageResource(R.drawable.mati);
                    not.setText("LOW");
                    text.setText("HIGH");
                    i=0;
                }
            }
        });
    }
}
