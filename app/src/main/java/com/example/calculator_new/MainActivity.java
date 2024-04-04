package com.example.calculator_new;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void add(View v) {
        EditText et1 = (EditText) findViewById(R.id.firstn);
        EditText et2 = (EditText) findViewById(R.id.secondn);
        EditText et3 = (EditText) findViewById(R.id.thirdn);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        et3.setText("Total Value  " + result);


    }

    public void sub(View v) {
        EditText et1 = (EditText) findViewById(R.id.firstn);
        EditText et2 = (EditText) findViewById(R.id.secondn);
        EditText et3 = (EditText) findViewById(R.id.thirdn);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;

        et3.setText("Total Value  " + result);

    }
    public void multiply(View v) {
        EditText et1 = (EditText) findViewById(R.id.firstn);
        EditText et2 = (EditText) findViewById(R.id.secondn);
        EditText et3 = (EditText) findViewById(R.id.thirdn);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        et3.setText("Total Value  " + result);

    }

    public void divide(View v) {
        EditText et1 = (EditText) findViewById(R.id.firstn);
        EditText et2 = (EditText) findViewById(R.id.secondn);
        EditText et3 = (EditText) findViewById(R.id.thirdn);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;

        et3.setText("Total Value  " + result);

    }

}