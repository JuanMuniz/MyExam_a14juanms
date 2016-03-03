package com.example.a14juanms.myexama14juanms;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class my_exam_a14juanms extends Activity {

    Button btnIntroduce,btnStart;
    EditText etNameSur;
    EditText etModule;
    Spinner spDay,spMonth,spYear;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_exam_a14juanms);

        btnIntroduce=(Button)findViewById(R.id.btnIntroduce);
        btnStart=(Button)findViewById(R.id.btnStart);
        etModule=(EditText)findViewById(R.id.etModule);
        etNameSur=(EditText)findViewById(R.id.etNameSur);
        spDay=(Spinner)findViewById(R.id.spDay);
        spMonth=(Spinner)findViewById(R.id.spMonth);
        spYear=(Spinner)findViewById(R.id.spYear);


        btnIntroduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etModule.getText().toString().equals("") || etNameSur.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),getString(R.string.faltan),Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), etNameSur.getText().toString()
                            + " " + etModule.getText().toString(), Toast.LENGTH_SHORT).show();
                    intent = new Intent(getApplicationContext(), exam2_a14juanms.class);
                    intent.putExtra("NAME", etNameSur.getText().toString());
                    intent.putExtra("MODULE", etModule.getText().toString());
                    etModule.setText("");
                    etNameSur.setText("");
                }

            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intent!=null){
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),getString(R.string.garda),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
