package com.example.myapplication181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class student_form extends AppCompatActivity {
Button send_btn;
EditText edtemail,edtname,edtcell,edtsemester,edtgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        edtname=findViewById(R.id.t2edtname);
        edtemail=findViewById(R.id.t2edtemail);
        edtcell=findViewById(R.id.t2edtcell);
        edtsemester=findViewById(R.id.t2edtsemester);
        edtgpa=findViewById(R.id.t2edtgpa);

    }

    public void Send(View view) {

        String name = edtname.getText().toString();
        String email = edtemail.getText().toString();
        String cell = edtcell.getText().toString();
        String semester = edtsemester.getText().toString();
        String gpa = edtgpa.getText().toString();
        Intent intent=new Intent(this,student_form_output.class);
        intent.putExtra("Key1",name);
        intent.putExtra("Key2",email);
        intent.putExtra("Key3",cell);
        intent.putExtra("Key4",semester);
        intent.putExtra("Key5",gpa);
        startActivity(intent);
    }

}