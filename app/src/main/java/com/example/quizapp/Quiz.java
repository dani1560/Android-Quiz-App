package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

RadioGroup rg1,rg2,rg3,rg4,rg5;
RadioButton rb1,rb2,rb3,rb4,rb5;
int cal;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);
        rg4=findViewById(R.id.rg4);
        rg5=findViewById(R.id.rg5);

        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioid=rg1.getCheckedRadioButtonId();
                rb1=findViewById(radioid);

                int radioid2=rg2.getCheckedRadioButtonId();
                rb2=findViewById(radioid2);

                int radioid3=rg3.getCheckedRadioButtonId();
                rb3=findViewById(radioid3);


        int radioid4=rg4.getCheckedRadioButtonId();
        rb4=findViewById(radioid4);


        int radioid5=rg5.getCheckedRadioButtonId();
        rb5=findViewById(radioid5);


if(rb1.getText().toString().equals("Collections")) {
cal++;

}
if(rb2.getText().toString().equals("Set")) {
                   cal++;

}
if(rb3.getText().toString().equals("Depends upon the type of variable")) {
    cal++;
}
if(rb4.getText().toString().equals("Static Binding")) {
    cal++;
}
if(rb5.getText().toString().equals("16bit")) {
    cal++;
}


                AlertDialog.Builder ab=new AlertDialog.Builder(Quiz.this);
                ab.setTitle("QUIZ SUBMITTED SUCCESSFULLY");
                ab.setMessage("Congrates !! You got "+cal+" out of 5 marks\n\n Answer Key:\n\n" +
                        " Q1)Collections \n Q2)Set \n Q3)Depends upon the type of variable " +
                        "\n Q4)Static Binding \n Q5)16bit");
                cal=0;
                ab.setNegativeButton("Quit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);
                    }
                });
                        ab.show();



            }

        });


    }
//    public void radiocheck(View v){
//
//        int radioid=rg1.getCheckedRadioButtonId();
//        rb1=findViewById(radioid);
//       // Toast.makeText(this,rb1.getText().toString()+"",Toast.LENGTH_LONG).show();
//
////        int radioid2=rg2.getCheckedRadioButtonId();
////        rb2=findViewById(radioid);
////        Toast.makeText(this,rb2.getText().toString()+"",Toast.LENGTH_LONG).show();
////
////        int radioid3=rg3.getCheckedRadioButtonId();
////        rb3=findViewById(radioid);
////
////
////        int radioid4=rg4.getCheckedRadioButtonId();
////        rb4=findViewById(radioid);
////
////
////        int radioid5=rg5.getCheckedRadioButtonId();
////        rb5=findViewById(radioid);
////


//    }
}
