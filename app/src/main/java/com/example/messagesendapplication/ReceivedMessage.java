package com.example.messagesendapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessage extends AppCompatActivity {

    private TextView textViewReceivedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceivedMsg = findViewById(R.id.textViewReceivedMsg);
        Intent intent = getIntent();
        String receivedMsg = intent.getStringExtra("msg");
        textViewReceivedMsg.setText(receivedMsg);
    }
}