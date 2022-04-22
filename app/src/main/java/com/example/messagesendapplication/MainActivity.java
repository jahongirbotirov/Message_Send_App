package com.example.messagesendapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void onClickSendMsg(View view) {
        String msg = editTextMessage.getText().toString();
//        Intent intent = new Intent(this,ReceivedMessage.class);
//        intent.putExtra("msg",msg);
//        startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        Intent choosenIntent = Intent.createChooser(intent,getString(R.string.title_choosen_text));
        startActivity(choosenIntent);

    }
}