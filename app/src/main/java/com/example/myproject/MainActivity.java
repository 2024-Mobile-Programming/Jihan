package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText titleEditText, authorEditText, dateEditText, contentEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleEditText = findViewById(R.id.edit1);
        authorEditText = findViewById(R.id.edit2);
        dateEditText = findViewById(R.id.edit3);
        contentEditText = findViewById(R.id.edit4);
        submitButton = findViewById(R.id.but1);

        // 버튼 클릭 이벤트 처리
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 입력된 데이터를 가져옴
                String title = titleEditText.getText().toString();
                String author = authorEditText.getText().toString();
                String date = dateEditText.getText().toString();
                String content = contentEditText.getText().toString();

            }
        });
    }
}