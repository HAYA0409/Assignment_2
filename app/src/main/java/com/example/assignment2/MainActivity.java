package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText EnterName;
    Button SendButton;
    TextView ShowName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EnterName=(EditText)findViewById(R.id.EnterName);
        SendButton=(Button)findViewById(R.id.SendButton);
        ShowName=(TextView)findViewById(R.id.ShowName);
        SendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = EnterName.getText().toString();
                ShowName.setText("Hello " + userName);
            }
        });

    }
}