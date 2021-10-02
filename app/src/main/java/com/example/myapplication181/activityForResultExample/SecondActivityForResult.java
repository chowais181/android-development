package com.example.myapplication181.activityForResultExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication181.R;

public class SecondActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_for_result);
        Intent intent=getIntent();
        int value1=intent.getIntExtra("V1",1);
        int value2=intent.getIntExtra("V2",1);
        int newValue=value1 + value2 +10;
        intent.putExtra("V4",newValue);
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
    }
}