package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Bai1 extends AppCompatActivity {
    TextView txtResult;
    String link;
    Button btnInsert;

    EditText inName, inScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1);

        txtResult = findViewById(R.id.result);
        btnInsert = findViewById(R.id.btnB1);
        inName = findViewById(R.id.inName);
        inScore = findViewById(R.id.inScore);

        link = "http://192.168.1.26/std.php";
    }

    public void B1Send(View view) {
        AsyncTaskGet b1Active = new AsyncTaskGet(this, link, inName.getText().toString(), inScore.getText().toString(), txtResult);
        b1Active.execute();
    }
}
