package com.example.mlrit.app4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et1,et2,et3;
     int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(Button)findViewById(R.id.b1);
        et1 =(EditText)findViewById(R.id.et1);
        et2 =(EditText)findViewById(R.id.et2);
        et3 =(EditText)findViewById(R.id.et3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                c =a+b;

                et3.setText(Integer.toString(c));
            }
        });


    }
}
