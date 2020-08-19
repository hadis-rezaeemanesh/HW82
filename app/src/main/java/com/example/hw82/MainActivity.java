package com.example.hw82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button mButton0;
    private Button mButtonDelete;
    private Button mButtonDivide;
    private Button mButtonMultiple;
    private Button mButtonSub;
    private Button mButtonSum;
    private Button mButtonDot;
    private Button mButtonEqual;
    private Button[] buttons = new Button[10];
    private TextView mScreen;
    private float value1;
    private float value2;
    private boolean mAddition;
    private boolean mSubtract;
    private boolean mMultiplication;
    private boolean mDivision;

    private String mInput;
    private String mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
    }

    private void findViews(){
        mButton1 = findViewById(R.id.btn_1);
        mButton2 = findViewById(R.id.btn_2);
        mButton3 = findViewById(R.id.btn_3);
        mButton4 = findViewById(R.id.btn_4);
        mButton5 = findViewById(R.id.btn_5);
        mButton6 = findViewById(R.id.btn_6);
        mButton7 = findViewById(R.id.btn_7);
        mButton8 = findViewById(R.id.btn_8);
        mButton9 = findViewById(R.id.btn_9);
        mButton0 = findViewById(R.id.btn_0);
        mButtonDelete = findViewById(R.id.btn_delete);
        mButtonDivide = findViewById(R.id.btn_divide);
        mButtonMultiple = findViewById(R.id.btn_multiple);
        mButtonSub = findViewById(R.id.btn_sub);
        mButtonSum = findViewById(R.id.btn_sum);
        mButtonDot = findViewById(R.id.btn_dot);
        mButtonEqual = findViewById(R.id.btn_equal);
        mScreen = findViewById(R.id.txt_view_show);

    }

   /* private void buttonClick(View view){
        Button button = (Button ) view;
        String data = button.getText().toString();
        switch (data){
            case "×":
                mInput += "*";
                break;
            case ""
        }
    }*/

    private void setListeners(){
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "1");
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "2");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "3");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "4");
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "5");
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "6");
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "7");
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "8");
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "9");
            }
        });

        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + "0");
            }
        });

        mButtonMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mScreen.getText() + "");
                mMultiplication = true;
                mScreen.setText(null);
            }
        });

        mButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mScreen.getText() + "");
                mDivision = true;
                mScreen.setText(null);
            }
        });

        mButtonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mScreen.getText() + "");
                mAddition = true;
                mScreen.setText(null);
            }
        });

        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Float.parseFloat(mScreen.getText() + "");
                mSubtract = true;
                mScreen.setText(null);
            }
        });

        mButtonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(mScreen.getText() + "");

                if (mMultiplication == true){
                   mScreen.setText(value1 * value2 + "");
                   mMultiplication = false;
                }
                else if (mDivision == true){
                    mScreen.setText(value1 / value2 + "");
                    mDivision = false;
                }
                else if (mAddition == true){
                    mScreen.setText(value1 + value2 + "");
                    mAddition = false;
                }
                else if (mSubtract == true){
                    mScreen.setText(value1 - value2 + "");
                    mSubtract = false;
                }
            }
        });
        mButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText("");
            }
        });
        mButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScreen.setText(mScreen.getText() + ".");



            }
        });
    }

    }


