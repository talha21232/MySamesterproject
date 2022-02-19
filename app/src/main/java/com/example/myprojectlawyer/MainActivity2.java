package com.example.myprojectlawyer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button= findViewById(R.id.account);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(MainActivity2.this, "Register successfully please login here", Toast.LENGTH_SHORT).show();
            }
        });

        TextView login = findViewById(R.id.backlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(in);
                Toast.makeText(MainActivity2.this, "Login please", Toast.LENGTH_SHORT).show();
            }

        });
    }
}