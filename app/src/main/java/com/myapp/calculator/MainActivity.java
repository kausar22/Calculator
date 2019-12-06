package com.myapp.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView txtResult;
    EditText etxtFirstNumber,etxtSecondNumber;
    Button btnPlus,btnMinus,btnMulti,btnDivision,btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtResult=findViewById(R.id.txt_result);
        etxtFirstNumber=findViewById(R.id.etxt_number1);
        etxtSecondNumber=findViewById(R.id.etxt_number2);
        btnPlus=findViewById(R.id.btn_plus);
        btnMinus=findViewById(R.id.btn_minus);
        btnMulti=findViewById(R.id.btn_multi);
        btnDivision=findViewById(R.id.btn_division);
        btnClear=findViewById(R.id.btn_clear);


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1=etxtFirstNumber.getText().toString();
                String value2=etxtSecondNumber.getText().toString();

                if (value1.isEmpty() && value2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Input value", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    double number1=Double.parseDouble(value1); //convert string to double
                    double number2=Double.parseDouble(value2);

                    double result=number1+number2;

                    txtResult.setText(""+result);


                }



            }
        });









        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1=etxtFirstNumber.getText().toString();
                String value2=etxtSecondNumber.getText().toString();

                if (value1.isEmpty() && value2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Input value", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    double number1=Double.parseDouble(value1); //convert string to double
                    double number2=Double.parseDouble(value2);

                    double result=number1-number2;

                    txtResult.setText(""+result);


                }



            }
        });





        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1=etxtFirstNumber.getText().toString();
                String value2=etxtSecondNumber.getText().toString();

                if (value1.isEmpty() && value2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Input value", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    double number1=Double.parseDouble(value1); //convert string to double
                    double number2=Double.parseDouble(value2);

                    double result=number1*number2;

                    txtResult.setText(""+result);


                }



            }
        });




        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1=etxtFirstNumber.getText().toString();
                String value2=etxtSecondNumber.getText().toString();

                if (value1.isEmpty() && value2.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Input value", Toast.LENGTH_SHORT).show();
                }

                else
                {
                    double number1=Double.parseDouble(value1); //convert string to double
                    double number2=Double.parseDouble(value2);

                    double result=number1/number2;

                    txtResult.setText(""+result);


                }



            }
        });




        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txtResult.setText("0");
                etxtFirstNumber.setText("");
                etxtSecondNumber.setText("");
            }
        });
    }
}
