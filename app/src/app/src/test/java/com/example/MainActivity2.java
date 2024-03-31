package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private Button button6;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button1 = (ImageButton) findViewById(R.id.ImageButton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity1();
            }

        });
        button2 = (ImageButton) findViewById(R.id.ImageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity2();
            }

        });
        button3 = (ImageButton) findViewById(R.id.ImageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity3();
            }

        });
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity6();
            }

        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity4();
            }

        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openButtonActivity5();
            }

        });

    }
    public void openButtonActivity1(){
        Intent intent1 = new Intent(this, ButtonActivity1.class);
        startActivity(intent1);
    }
    public void openButtonActivity2(){
        Intent intent2 = new Intent(this, ButtonActivity2.class);
        startActivity(intent2);
    }
    public void openButtonActivity3(){
        Intent intent3 = new Intent(this, ButtonActivity3.class);
        startActivity(intent3);
    }
    public void openButtonActivity6(){
        Intent intent6 = new Intent(this, ButtonActivity6.class);
        startActivity(intent6);
    }
    public void openButtonActivity4(){
        Intent intent4 = new Intent(this, ButtonActivity4.class);
        startActivity(intent4);
    }
    public void openButtonActivity5(){
        Intent intent5 = new Intent(this, ButtonActivity5.class);
        startActivity(intent5);
    }
}