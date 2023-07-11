package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber;
    Button btnDelete, btnAllClear, btnPercent, btn9, btn8, btn7, btn6, btn5, btn4, btn3, btn2, btn1, btnZero,
            btnPlus, btnMinus, btnMultiplication, btnDivision, btnDot, btnEqual;
    TextView tvShow;
    float answer = 0;
    float num1, num2;
    boolean plus, minus, multiplication, division;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnZero = findViewById(R.id.btnZero);

        btnEqual = findViewById(R.id.btnEqual);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivision = findViewById(R.id.btnDivision);
        btnPercent = findViewById(R.id.btnPercent);
        btnDot = findViewById(R.id.btnDot);

        tvShow = findViewById(R.id.tvShow);

        btnDelete = findViewById(R.id.btnDelete);
        btnAllClear = findViewById(R.id.btnAllClear);

        edtNumber = findViewById(R.id.edtNumber);


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnAllClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText("");
            }
            });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btnZero.getText());
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn1.getText());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn2.getText());
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn3.getText());
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn4.getText());
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn5.getText());
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn6.getText());
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn7.getText());
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn8.getText());
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btn9.getText());
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNumber.setText(edtNumber.getText().toString()+btnDot.getText());
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber == null) {
                    edtNumber.setText("");
                }
                else {
                    num1 = Float.parseFloat(edtNumber.getText().toString());
                    plus = true;
                    edtNumber.setText("");
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber == null) {
                    edtNumber.setText("");
                }
                else {
                    num1 = Float.parseFloat(edtNumber.getText().toString());
                    minus = true;
                    edtNumber.setText("");
                }

            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber == null) {
                    edtNumber.setText("");
                }
                else {
                    num1 = Float.parseFloat(edtNumber.getText().toString());
                    multiplication = true;
                    edtNumber.setText("");
                }

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNumber == null) {
                    edtNumber.setText("");
                }
                else {
                    num1 = Float.parseFloat(edtNumber.getText().toString());
                    division = true;
                    edtNumber.setText("");
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Float.parseFloat(edtNumber.getText().toString());

                if(plus){
                    edtNumber.setText(num1 + num2 +"");
                    plus = false;
                } else if (minus) {
                    edtNumber.setText(num1 - num2+ "");
                    minus = false;
                } else if (multiplication) {
                    edtNumber.setText(num1 * num2 + "");
                    multiplication = false;
                }else if (division) {
                    edtNumber.setText(num1 / num2 + "");
                    division = false;
                }
            }
        });


    }
}