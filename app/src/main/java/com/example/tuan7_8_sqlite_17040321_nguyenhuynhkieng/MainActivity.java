package com.example.tuan7_8_sqlite_17040321_nguyenhuynhkieng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private DatabaseHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHandler(this);

        Student s1 = new Student("Huynh Kieng","Ho Chi Minh","123456789");
        Student s2 = new Student("Minh","Ho Chi Minh","122222222");

        db.addStudent(s1);
        db.addStudent(s2);

    }
}