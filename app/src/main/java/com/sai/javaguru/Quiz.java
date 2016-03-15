package com.example.demo.javaguru;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.example.demo.javaguru.R;

public class Quiz extends Activity    {
    private Button btnSubmitQuiz;
    int score,ans1,ans2, ans3,ans4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        RadioGroup champ=(RadioGroup)findViewById(R.id.answer1);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch (checkedId) {
                    case R.id.answer1A:
                        ans1 = 1;
                        break;
                    case R.id.answer1B:
                        ans1 = 2;
                        //score++;
                        break;
                    case R.id.answer1C:
                        ans1 = 3;
                        break;
                    case R.id.answer1d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup gBall=(RadioGroup)findViewById(R.id.answer2);
        gBall.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer2A:
                        ans2 = 1;
                        break;
                    case R.id.answer2B:
                        ans2 = 2;
                        break;
                    case R.id.answer2C:
                        ans2 = 3;
                        break;
                    case R.id.answer2d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup gBoot = (RadioGroup)findViewById(R.id.answer3);
        gBoot.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer3A:
                        ans3 = 1;
                        break;
                    case R.id.answer3B:
                        ans3 = 2;
                        break;
                    case R.id.answer3C:
                        ans3 =3;
                        break;
                    case R.id.answer3d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup qw=(RadioGroup)findViewById(R.id.answer4);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer4a:
                        ans1 =1;
                        break;
                    case R.id.answer4b:
                        ans1 =2;
                        //score++;
                        break;
                    case R.id.answer4c:
                        ans1 =3;
                        break;
                    case R.id.answer4d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup qwe=(RadioGroup)findViewById(R.id.answer5);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer5a:
                        ans1 =1;
                        break;
                    case R.id.answer5b:
                        ans1 =2;
                        //score++;
                        break;
                    case R.id.answer5c:
                        ans1 =3;
                        break;
                    case R.id.answer5d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup qwer=(RadioGroup)findViewById(R.id.answer6);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer6a:
                        ans1 =1;
                        break;
                    case R.id.answer6b:
                        ans1 =2;
                        //score++;
                        break;
                    case R.id.answer6c:
                        ans1 =3;
                        break;
                    case R.id.answer6d:
                        ans4=4;
                        break;
                }
            }
        });
        RadioGroup qwert=(RadioGroup)findViewById(R.id.answer7);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer7A:
                        ans1 =1;
                        break;
                    case R.id.answer7B:
                        ans1 =2;
                        //score++;
                        break;

                }
            }
        });
        RadioGroup qwerty=(RadioGroup)findViewById(R.id.answer8);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer8A:
                        ans1 =1;
                        break;
                    case R.id.answer8B:
                        ans1 =2;
                        //score++;
                        break;

                }
            }
        });
        RadioGroup polo=(RadioGroup)findViewById(R.id.answer9);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer9A:
                        ans1 =1;
                        break;
                    case R.id.answer9B:
                        ans1 =2;
                        //score++;
                        break;
                    case R.id.answer9C:
                        ans1 =3;
                        break;
                    case R.id.answer9d:
                        ans1 =3;
                        break;
                }
            }
        });
        RadioGroup pool=(RadioGroup)findViewById(R.id.answer10);
        champ.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                switch(checkedId) {
                    case R.id.answer10A:
                        ans1 =1;
                        break;
                    case R.id.answer10B:
                        ans1 =2;
                        //score++;
                        break;

                }
            }
        });


        btnSubmitQuiz = (Button) findViewById(R.id.submit);
        btnSubmitQuiz.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                score =0;
                // TODO Auto-generated method stub
                if(ans1 == 6)
                    score++;
                if(ans2 == 2)
                    score++;
                if(ans3 == 2)
                    score++;
                if(ans4==0)
                    score++;
                Toast.makeText(Quiz.this, "Your score is:"+score+" out of 10", Toast.LENGTH_LONG).show();
                setContentView(R.layout.activity_menu);

            }
        });
    }

}