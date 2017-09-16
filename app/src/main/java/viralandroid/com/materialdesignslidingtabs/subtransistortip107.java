package viralandroid.com.materialdesignslidingtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vanhauten on 08/07/16.
 */
public class subtransistortip107 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subtransistortip107);


        Button pdf = (Button) findViewById(R.id.pdf);
        pdf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.fairchildsemi.com/datasheets/TI/TIP105.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        Button beli = (Button) findViewById(R.id.beli);
        beli.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.tokopedia.com/search?st=product&q=tip107"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}

