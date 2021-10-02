package com.example.myapplication181;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class student_form_output extends AppCompatActivity {
    TextView txtname,txtemail,txtcell,txtsemester,txtgpa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form_output);
        txtname=findViewById(R.id.t2txtname1);
        txtemail=findViewById(R.id.t2txtemail1);
        txtcell=findViewById(R.id.t2txtcell1);
        txtsemester=findViewById(R.id.t2txtsemester1);
        txtgpa=findViewById(R.id.t2txtgpa1);

        Intent intent=getIntent();
        String name = intent.getStringExtra("Key1");
        String email = intent.getStringExtra("Key2");
        String cell = intent.getStringExtra("Key3");
        String semester = intent.getStringExtra("Key4");
        String gpa = intent.getStringExtra("Key5");

        txtname.setText(name);
        txtemail.setText(email);
        txtcell.setText(cell);
        txtsemester.setText(semester);
        txtgpa.setText(gpa);
    }

    public void Back(View view) {
        Intent intent=new Intent(this,student_form.class);
        startActivity(intent);
    }

}