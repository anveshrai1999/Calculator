package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonDivision, buttonMul, buttonDecimal, buttonClear, buttonEqual;
    EditText inputValue;

    float mValueOne, mValueTwo;

    boolean Addition, mSubtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDecimal = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonClear = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        inputValue = (EditText) findViewById(R.id.edt1);

        button1.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "1"));
        button2.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "2"));

        button3.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "3"));

        button4.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "4"));

        button5.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "5"));

        button6.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "6"));

        button7.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "7"));

        button8.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "8"));

        button9.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "9"));

        button0.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "0"));

        buttonAdd.setOnClickListener(v -> {
            if (inputValue == null) {
                inputValue.setText("");
            } else {
                mValueOne = Float.parseFloat(String.valueOf(inputValue.getText()));
                Addition = true;
                inputValue.setText("+");
            }
        });

        buttonSub.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(String.
                    valueOf(inputValue.getText()));
            mSubtract = true;
            inputValue.setText(null);

        });

        buttonMul.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(String.valueOf(inputValue.getText()));
            Multiplication = true;
            inputValue.setText(null);
        });

        buttonDivision.setOnClickListener(v -> {
            mValueOne = Float.parseFloat(String.valueOf(inputValue.getText()));
            Division = true;
            inputValue.setText(null);
        });

        buttonEqual.setOnClickListener(v -> {
            mValueTwo = Float.parseFloat(String.valueOf(inputValue.getText()));
            if (Addition == true) {
                inputValue.setText(String.valueOf(mValueOne + mValueTwo));
                Addition = false;
            }

            if (mSubtract == true) {
                inputValue.setText(String.valueOf(mValueOne - mValueTwo));
                mSubtract = false;
            }

            if (Multiplication == true) {
                inputValue.setText(String.valueOf(mValueOne * mValueTwo));
                Multiplication = false;
            }
            if (Division == true) {
                inputValue.setText(String.valueOf(mValueOne / mValueTwo));
                Division = false;
            }

            if (inputValue == null) {
                inputValue.setText(String.valueOf(inputValue.getText()));
            }
        });

        buttonClear.setOnClickListener(v -> inputValue.setText(""));
        buttonDecimal.setOnClickListener(v -> inputValue.setText(inputValue.getText() + "."));


    }
}