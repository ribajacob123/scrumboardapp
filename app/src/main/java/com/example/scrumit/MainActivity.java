package com.example.scrumit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button task1;
    private Button task2;
    private Button task3;
    private Button task4;
    private Button task5;
    private Button task6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        task1 = (Button) findViewById(R.id.emp1);
        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open1();
            }
        });

        task2 = (Button) findViewById(R.id.emp2);
        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open2();
            }
        });

        task3 = (Button) findViewById(R.id.emp3);
        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open3();
            }
        });

        task4 = (Button) findViewById(R.id.emp4);
        task4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open4();
            }
        });

        task5 = (Button) findViewById(R.id.emp5);
        task5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open5();
            }
        });

        task6 = (Button) findViewById(R.id.emp6);
        task6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open6();
            }
        });
    }

    public void open1(){
        Intent intent = new Intent(this, Task1.class);
        startActivity(intent);
    }

    public void open2(){
        Intent intent = new Intent(this, Task2.class);
        startActivity(intent);
    }

    public void open3(){
        Intent intent = new Intent(this, Task3.class);
        startActivity(intent);
    }

    public void open4(){
        Intent intent = new Intent(this, Task4.class);
        startActivity(intent);
    }

    public void open5(){
        Intent intent = new Intent(this, Task5.class);
        startActivity(intent);
    }

    public void open6(){
        Intent intent = new Intent(this, Task6.class);
        startActivity(intent);
    }
}
