package com.example.myapplication181.activityForResultExample;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication181.R;
import com.example.myapplication181.intentexample.ToastExample;

public class FirstActivityForResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_for_result);
    }

    public void GoToSecondActivity(View view) {
        Intent intent=new Intent(this,SecondActivityForResult.class);
        intent.putExtra("V1",5);
        intent.putExtra("V2",5);
//        startActivityForResult(intent,101);
        MyResult.launch(intent);
    }

    ActivityResultLauncher<Intent> MyResult = registerForActivityResult
            (new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {
                         if(result.getResultCode()==RESULT_OK){
                             Intent value = result.getData();
                             int newResult=value.getIntExtra("V4",1);
                             Toast.makeText(FirstActivityForResult.this, "Back to main"+ newResult,Toast.LENGTH_LONG).show();
                         }
                        }
                    });






    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }*/
}