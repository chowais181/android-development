
package com.example.myapplication181.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication181.R;

import java.util.zip.Inflater;

public class ToastExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_example);
    }

    public void ShowToast(View view) {
        Toast toast=new Toast(this);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0, 0);
        toast .setDuration(Toast.LENGTH_LONG);
        LayoutInflater obj=getLayoutInflater();
        toast.setView(getLayoutInflater().inflate(R.layout.imagetotoast, null));
        toast.show();
    }
}