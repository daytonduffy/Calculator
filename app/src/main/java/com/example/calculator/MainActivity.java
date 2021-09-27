package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionAdd(View view) {
        EditText integerOne = (EditText) findViewById(R.id.integerOne);
        int i1 = Integer.parseInt(integerOne.getText().toString());

        EditText integerTwo = (EditText) findViewById(R.id.integerTwo);
        int i2 = Integer.parseInt(integerTwo.getText().toString());

        goToActivity2(i1 + i2);
    }
    public void clickFunctionSub(View view) {
        EditText integerOne = (EditText) findViewById(R.id.integerOne);
        int i1 = Integer.parseInt(integerOne.getText().toString());

        EditText integerTwo = (EditText) findViewById(R.id.integerTwo);
        int i2 = Integer.parseInt(integerTwo.getText().toString());

        goToActivity2(i1 - i2);
    }
    public void clickFunctionMul(View view) {
        EditText integerOne = (EditText) findViewById(R.id.integerOne);
        int i1 = Integer.parseInt(integerOne.getText().toString());

        EditText integerTwo = (EditText) findViewById(R.id.integerTwo);
        int i2 = Integer.parseInt(integerTwo.getText().toString());

        goToActivity2(i1 * i2);
    }
    public void clickFunctionDiv(View view) {
        EditText integerOne = (EditText) findViewById(R.id.integerOne);
        int i1 = Integer.parseInt(integerOne.getText().toString());

        EditText integerTwo = (EditText) findViewById(R.id.integerTwo);
        int i2 = Integer.parseInt(integerTwo.getText().toString());

        goToActivity2(i1 / i2);
    }

    private void goToActivity2(int val) {

        String send = String.valueOf(val);

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", send);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}