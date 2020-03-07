package com.mayank.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resulttextView;
    private Button backButton;
    private String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        resulttextView=findViewById(R.id.result_textview);
        backButton=findViewById(R.id.back_button);
        resultText=getIntent().getStringExtra(LCOTextRecognization.RESULT_TEXT);

        resulttextView.setText(resultText);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
