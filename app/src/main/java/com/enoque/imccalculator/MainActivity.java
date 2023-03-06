package com.enoque.imccalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TextView txtvResult;
    private Button btn_Calculate;

    private TextView  edit_wight;
    private  TextView edit_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtvResult = findViewById(R.id.txtw_reesult);
        btn_Calculate = findViewById(R.id.btn_calcular);

        edit_wight = findViewById(R.id.etxt_whight);
        edit_height = findViewById(R.id.etxt_height);

        btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double weight = Double.valueOf(edit_wight.getText().toString());
                Double height =  Double.valueOf(edit_height.getText().toString());
                Double imc = weight / (height * height);


                if(imc < 18.5) {
                    txtvResult.setText(""+ imc + " Abaixo do peso");
                } else if (imc >= 18.5 &&  imc < 25) {
                    txtvResult.setText("" +imc + " Peso ideal");
                } else if (imc >= 25 && imc < 30) {
                    txtvResult.setText("" +imc + " Acima do peso");
                } else if (imc >= 30 && imc <= 35) {
                    txtvResult.setText("" +imc + " Obesidade");
                }


            }
        });
    }
}