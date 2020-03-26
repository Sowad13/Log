package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity implements
        View.OnClickListener{
    Button backToMainActivityButton;
    TextView nameTextView, studentIDTextView, userIDTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(Main2Activity.this, "Login Successful",
                Toast.LENGTH_SHORT).show();
        backToMainActivityButton = (Button)
                findViewById(R.id.logoutButton);
        backToMainActivityButton.setOnClickListener(this);
        nameTextView = (TextView) findViewById(R.id.name);
        studentIDTextView = (TextView) findViewById(R.id.StudentID);
        userIDTextView = (TextView) findViewById(R.id.userIDShow);


    }

    @Override
    public void onClick(View v) {

        Intent logoutIntent = new Intent(Main2Activity.this,
                MainActivity.class);

        startActivity(logoutIntent);
        }
}