package com.example.ulyana.myproject1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus(View v){
        EditText num1 = (EditText) findViewById(R.id.first_number);
        EditText num2 = (EditText) findViewById(R.id.first_number);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        EditText res = (EditText) findViewById(R.id.text);
        res.setText(Integer.parseInt(snum1)+Integer.parseInt(snum2)+"");
    }
}
