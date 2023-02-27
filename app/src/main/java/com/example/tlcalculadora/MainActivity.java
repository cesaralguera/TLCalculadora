package com.example.tlcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText txtNumero1, txtNumero2;
    TextView txtV1;
    float n1,n2, res;
    Button btnSuma, btnResta, btnDivision, btnMultiplicacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero1 = (EditText) findViewById(R.id.txtNumero1);
        txtNumero2 = (EditText) findViewById(R.id.txtNumero2);
        txtV1 = (TextView) findViewById(R.id.txtV1);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(txtNumero1.getText().toString());
                n2 = Float.parseFloat(txtNumero2.getText().toString());
                res = n1 + n2;
                txtV1.setText("El resultado de la suma es: "+res);
                Toast.makeText(MainActivity.this, "El resultado es:"+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(txtNumero1.getText().toString());
                n2 = Float.parseFloat(txtNumero2.getText().toString());
                res = n1 - n2;
                txtV1.setText("El resultado de la resta es: "+res);
                Toast.makeText(MainActivity.this, "El resultado es: "+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(txtNumero1.getText().toString());
                n2 = Float.parseFloat(txtNumero2.getText().toString());
                res = n1 * n2;
                txtV1.setText("El resultado de la multiplicacion es: "+res);
                Toast.makeText(MainActivity.this, "El resultado es: "+res, Toast.LENGTH_SHORT).show();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Float.parseFloat(txtNumero1.getText().toString());
                n2 = Float.parseFloat(txtNumero2.getText().toString());
                res = n1 / n2;
                txtV1.setText("El resultado de la division es: "+res);
                Toast.makeText(MainActivity.this, "El resultado es: "+res, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

