package com.example.appfreakingmath28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Làm tròn 0.5
//        int number1 = Math.round(1.49f);
//        Log.d("BBB", number1 + "");
        // Làm tròn xuống
//        double number2 = Math.floor(1.999999);
//        Log.d("BBB", number2 + "");
        // Làm tròn lên
//        double number3 = Math.ceil(1.0001);
//        Log.d("BBB", number3 + "");
        // Random
//        double number4 = Math.random();
//        Log.d("BBB", number4 + "");

        // Builtin - function
//        double number5 =  Math.round(Math.random() * (10 - 5)) + 5;
//        Log.d("BBB",number5 + "");
        // 5 - 10
        Random random = new Random();
        for (int i = 0; i < 50 ; i++) {
            // (smax - smin + 1) + smin
            int number6 = random.nextInt(10 - 5 + 1) + 5;
            Log.d("BBB",number6 + "");
        }


    }
}