package com.example.physics_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }
    public void openActivity(View v){
        Intent intent = new Intent(this, MainActivity4.class);
        textView=findViewById(R.id.textView2);


        startActivity(intent);
    }
}