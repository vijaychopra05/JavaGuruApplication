package com.example.demo.javaguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menuActivity extends AppCompatActivity implements View.OnClickListener {
Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        if(v==btn1){

            Intent i=new Intent(this,AndroidVideoIntro.class);
            startActivity(i);

        }
        if(v==btn2){

            Intent i=new Intent(this,AndroidVideo.class);
            startActivity(i);

        }if(v==btn3){

            Intent i=new Intent(this,AndroidInheritance.class);
            startActivity(i);

        }if(v==btn4){

            Intent i=new Intent(this,AndroidVideoExec.class);
            startActivity(i);

        }if(v==btn5){

            Intent i=new Intent(this,Quiz.class);
            startActivity(i);

        }
    }
}
