package com.example.a14juanms.myexama14juanms;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class exam2_a14juanms extends Activity {

    RadioButton rbSus, rbApr, rbNot, rbSob;
    RadioGroup rg1;
    TextView txtNora, txtAca, txtNota;
    Button btnScore;
    Intent intent;
    String modulo;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2_a14juanms);

        btnScore = (Button) findViewById(R.id.btnScore);
        rbSob = (RadioButton) findViewById(R.id.rbSob);
        rbApr = (RadioButton) findViewById(R.id.rbApr);
        rbNot = (RadioButton) findViewById(R.id.rbNot);
        rbSus = (RadioButton) findViewById(R.id.rbSus);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        txtAca = (TextView) findViewById(R.id.txtAcaba);
        txtNota = (TextView) findViewById(R.id.txtNota);
        txtNora = (TextView) findViewById(R.id.txtNora);

        intent = getIntent();
        nombre = intent.getExtras().getString("NAME");
        modulo = intent.getExtras().getString("MODULE");

        txtNora.setText(getString(R.string.noraboa)+ " " + nombre);
        txtAca.setText(getString(R.string.acabaches) + " " + modulo);


        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbSus.isChecked()) {
                    txtNota.setText(getString(R.string.nota)+" "+getString(R.string.suspenso));
                } else if (rbApr.isChecked()) {
                    txtNota.setText(getString(R.string.nota)+" "+getString(R.string.aprobado));
                } else if (rbNot.isChecked()) {
                    txtNota.setText(getString(R.string.nota)+" "+getString(R.string.notable));
                } else if (rbSob.isChecked()) {
                    txtNota.setText(getString(R.string.nota)+" "+getString(R.string.sobresaliente));
                }else  {
                    Toast.makeText(getApplicationContext(),getString(R.string.nada),Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
