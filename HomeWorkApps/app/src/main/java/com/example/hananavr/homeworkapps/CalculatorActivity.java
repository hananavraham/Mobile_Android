package com.example.hananavr.homeworkapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    int num1;
    int num2;
    int result;
    String action;
    boolean plus,minus,multi,divide = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void onNum7Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "7");
    }

    public void onNum8Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "8");
    }

    public void onNum9Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "9");
    }

    public void onNum4Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "4");
    }

    public void onNum5Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "5");
    }

    public void onNum6Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "6");
    }

    public void onNum1Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "1");
    }

    public void onNum2Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "2");
    }

    public void onNum3Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "3");
    }

    public void onResultClick(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        String temp = tv.getText().toString();
        int len = temp.length();

        if (multi == true) {
            int index = temp.indexOf('*') + 2;
            num2 = Integer.parseInt(temp.substring(index, len));
            result = num1 * num2;
            tv.setText(result + "");
        }

        else if (divide == true) {
            int index = temp.indexOf('/') + 2;
            num2 = Integer.parseInt(temp.substring(index, len));
            result = num1 / num2;
            tv.setText(result + "");
        }

        else if (minus == true) {
            int index = temp.indexOf('-') + 2;
            String num = temp.substring(index, len);
            num2 = Integer.parseInt(num);
            result = num1 - num2;
            tv.setText(result + "");
        }

        else if (plus == true) {
            int index = temp.indexOf('+') + 2;
            num2 = Integer.parseInt(temp.substring(index, len));
            result = num1 + num2;
            tv.setText(result + "");
        }

        tv.setText(null);
        plus = minus = multi = divide = false;
        tv.setText(result + "");
        num1 = result;
    }

    public void onNum0Click(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(tv.getText() + "0");
    }

    public void onClearClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(null);
        num1 = num2 = result = 0;
        plus = minus = multi = divide = false;
    }

    public void onPlusClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        num1 = Integer.parseInt(tv.getText().toString());
        tv.setText(num1 + " + ");
        plus = true;
    }

    public void onMinusClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        num1 = Integer.parseInt(tv.getText().toString());
        tv.setText(num1 + " - ");
        minus = true;
    }

    public void onMulClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        num1 = Integer.parseInt(tv.getText().toString());
        tv.setText(num1 + " * ");
        multi = true;
    }

    public void onDivideClick(View view) {
        TextView tv = (TextView)findViewById(R.id.textView);
        num1 = Integer.parseInt(tv.getText().toString());
        tv.setText(num1 + " / ");
        divide = true;
    }

//    public void onResultClick(View view) {
//        TextView tv = (TextView) findViewById(R.id.textView);
//        String temp = tv.getText().toString();
//        int len = temp.length();
//
//        if (multi == true) {
//            int index = temp.indexOf('*') + 2;
//            num2 = Integer.parseInt(temp.substring(index, len));
//            result = num1 * num2;
//            tv.setText(result + "");
//        }
//
//        else if (divide == true) {
//            int index = temp.indexOf('/') + 2;
//            num2 = Integer.parseInt(temp.substring(index, len));
//            result = num1 / num2;
//            tv.setText(result + "");
//        }
//
//        else if (minus == true) {
//            int index = temp.indexOf('-') + 2;
//            String num = temp.substring(index, len);
//            num2 = Integer.parseInt(num);
//            result = num1 - num2;
//            tv.setText(result + "");
//        }
//
//        else if (plus == true) {
//            int index = temp.indexOf('+') + 2;
//            num2 = Integer.parseInt(temp.substring(index, len));
//            result = num1 + num2;
//            tv.setText(result + "");
//        }
//
//        tv.setText(null);
//        plus = minus = multi = divide = false;
//        tv.setText(result + "");
//        num1 = result;
//
//    }
//
//    public void onClearClick(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(null);
//        num1 = num2 = result = 0;
//        plus = minus = multi = divide = false;
//    }
//
//    public void onMulClick(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        num1 = Integer.parseInt(tv.getText().toString());
//        tv.setText(num1 + " * ");
//        multi = true;
//    }
//
//    public void onDivideClick(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        num1 = Integer.parseInt(tv.getText().toString());
//        tv.setText(num1 + " / ");
//        divide = true;
//    }
//
//    public void onMinusClick(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        num1 = Integer.parseInt(tv.getText().toString());
//        tv.setText(num1 + " - ");
//        minus = true;
//    }
//
//    public void onPlusClick(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        num1 = Integer.parseInt(tv.getText().toString());
//        tv.setText(num1 + " + ");
//        plus = true;
//    }
//
//    public void onNum9Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "9");
//    }
//
//    public void onNum8Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "8");
//    }
//
//    public void onNum7Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "7");
//    }
//
//    public void onNum6Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "6");
//    }
//
//    public void onNum5Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "5");
//    }
//
//    public void onNum4Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "4");
//    }
//
//    public void onNum3Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "3");
//    }
//
//    public void onNum2Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "2");
//    }
//
//    public void onNum1Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "1");
//    }
//
//    public void onNum0Click(View view) {
//        TextView tv = (TextView)findViewById(R.id.textView);
//        tv.setText(tv.getText() + "0");
//    }
}

