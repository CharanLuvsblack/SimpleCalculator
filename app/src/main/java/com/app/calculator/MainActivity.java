package com.app.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnBrace,btnDivide,btnMultiply,btnMinus,btnAdd,btnPercent,btnClear,btnEqual;
    TextView outputView,inputView;
    String process;
    Boolean brace = false;
    Boolean Dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnDot = findViewById(R.id.btnDot);
        btnBrace = findViewById(R.id.btnBrace);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnAdd = findViewById(R.id.btnAdd);
        btnPercent = findViewById(R.id.btnPercent);

        btnClear = findViewById(R.id.btnClear);
        btnEqual = findViewById(R.id.btnEqual);

        outputView = findViewById(R.id.outputView);
        inputView = findViewById(R.id.inputView);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView.setText("");
                outputView.setText("");
                brace= false;
                Dot= false;
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"9");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"-");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"+");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"*");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"/");
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();
                inputView.setText(process+"%");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Dot){
                    process=inputView.getText().toString();
                    inputView.setText(process+"");
                }else{
                    process=inputView.getText().toString();
                    if(process==""){
                        inputView.setText(process+"0.");
                    }else{
                        inputView.setText(process+".");
                    }
                    Dot= true;
                }
            }
        });
        btnBrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (brace){
                    process=inputView.getText().toString();
                    inputView.setText(process+")");
                    brace= false;
                }else{
                    process=inputView.getText().toString();
                    inputView.setText(process+"*(");
                    brace= true;
                }

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=inputView.getText().toString();

                process= process.replaceAll("%","/100*");

                DoubleEvaluator evaluator = new DoubleEvaluator();


                try{
                    Double result = evaluator.evaluate(process);
                    String finalResult = result.toString();

                    outputView.setText(finalResult);
                }
                catch(Exception err){

                    outputView.setText("Error");
                }





            }
        });


    }

}