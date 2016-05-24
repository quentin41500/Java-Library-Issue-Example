package com.quentin.javalibraryerrorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//Trying to access MyClass
import com.quentin.MyClass;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.MyClass.test();
  }
}
