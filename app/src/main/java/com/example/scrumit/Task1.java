package com.example.scrumit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Task1 extends AppCompatActivity {
    private Button b1;

    private Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        b1 = (Button) findViewById(R.id.emp1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open1();
            }
        });

        b3 = (Button) findViewById(R.id.e13);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open3();
            }
        });
    }

    public void open1(){
        Intent intent = new Intent(this, task1emp1.class);
        startActivity(intent);
    }
    public void open3(){
        Intent intent = new Intent(this, task1emp1.class);
        startActivity(intent);
    }

}
