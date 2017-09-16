package viralandroid.com.materialdesignslidingtabs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by vanhauten on 10/07/16.
 */

public class kalkulator extends AppCompatActivity {
    private EditText txtOne;
    private EditText txtTwo;
    private EditText txtResult1,txtResult2;
    private Button btnCount;
    private int paralel;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);
        txtOne = (EditText) findViewById(R.id.r1);
        txtTwo = (EditText) findViewById(R.id.R2);
        txtResult1 = (EditText) findViewById(R.id.seri);
        txtResult2 = (EditText) findViewById(R.id.editText5);
        btnCount = (Button) findViewById(R.id.button3);

        btnCount.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (txtOne.getText() == null || txtTwo.getText() == null)
                {
                    final Toast toast = Toast.makeText(getApplicationContext(), "R1 dan R2 tidak boleh kosong", Toast.LENGTH_SHORT);
                    toast.show();
                }

                     else { txtResult1.setText(String.valueOf(Double.parseDouble(txtOne.getText().toString()) + Double.parseDouble(txtTwo.getText().toString())));
                }
                Double value1 = Double.parseDouble(txtOne.getText().toString());
                Double value2 = Double.parseDouble(txtTwo.getText().toString());
                // do the calculation
                Double hValue1 = (1/value1);
                Double hValue2 = (1/value2);
                double hasil = hValue1+hValue2;
                double hasila = (1/hasil);
                txtResult2.setText(String.valueOf(hasila));
            }
        });
    }
}
