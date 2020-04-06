package com.cis.ageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText TxtYear;
    Button AgeCal;
    TextView Result;
    int UserYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxtYear=findViewById(R.id.txt);
        AgeCal=findViewById(R.id.btn);
        Result=findViewById(R.id.sh);
        AgeCal.setOnClickListener(this);
/*
        AgeCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year=TxtYear.getText().toString();
                UserYear=Integer.valueOf(year);
                int UserAge=2020-UserYear;

                Result.setText("Your Age: "+UserAge);
                Toast.makeText(getBaseContext(),"Your Age = " + UserAge,Toast.LENGTH_LONG).show();
            }
        });
*/

    }

    @Override
    public void onClick(View v) {
        String year=TxtYear.getText().toString();
        UserYear=Integer.valueOf(year);
        int UserAge=2020-UserYear;

        Result.setText("Your Age: "+UserAge);
        Toast.makeText(getBaseContext(),"Your Age = " + UserAge,Toast.LENGTH_LONG).show();
    }
}
