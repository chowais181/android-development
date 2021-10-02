package com.example.myapplication181.PermissionExample;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.CAMERA;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication181.R;

public class PermissionExampleOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_example_one);
    }

    public void requestPermisson(View view) {
        if(!check_permission()){
            Request_Permission();
        }else {
            Toast.makeText(this,"permission already granted",Toast.LENGTH_LONG).show();
        }
    }

    public void checkPermission(View view) {
        if(!check_permission()){
            Toast.makeText(this,"please request for permission",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Permission already granted",Toast.LENGTH_LONG).show();
        }

    }
    public boolean check_permission(){
        int result1 = ContextCompat.checkSelfPermission(getApplicationContext(),ACCESS_FINE_LOCATION);
        int result2 = ContextCompat.checkSelfPermission(getApplicationContext(),CAMERA);
        return result1== PackageManager.PERMISSION_GRANTED && result2 == PackageManager.PERMISSION_GRANTED;
    }
    public void Request_Permission(){
        ActivityCompat.requestPermissions(this,new String[]{ACCESS_FINE_LOCATION,CAMERA},101);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==101 && grantResults[0] ==PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"Permission Granted",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Permission denied",Toast.LENGTH_LONG).show();
        }

    }
}