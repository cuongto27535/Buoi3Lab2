package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai2 extends AppCompatActivity {
    EditText inWidth, inHeight;
    TextView txtResult;
    Button btnB2;
    String width, height, link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);

        inWidth = findViewById(R.id.inWidth);
        inHeight = findViewById(R.id.inHeight);
        btnB2 = findViewById(R.id.btnB2);
        txtResult = findViewById(R.id.txtResult);
        link = "http://192.168.1.166/bai2.php";

        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                width = inWidth.getText().toString();
                height = inHeight.getText().toString();

                BackgroundTask_POST backgroundTaskPost = new BackgroundTask_POST(link, Bai2.this, width, height, txtResult);
                backgroundTaskPost.execute();
            }
        });
    }
}