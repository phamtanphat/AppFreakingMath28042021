package com.example.appfreakingmath28042021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;

public class MainActivity extends AppCompatActivity {


    TextView mTvScore, mTvCalculator, mTvResult;
    ImageButton mImgBtnWin, mImgBtnLose;
    int mNumber1 = 0, mNumber2 = 0, mIndexCalculator = -1, mResult = -1;
    boolean mIsTrue;
    Random mRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvScore = findViewById(R.id.textViewScore);
        mTvCalculator = findViewById(R.id.textViewCalculator);
        mTvResult = findViewById(R.id.textViewResult);
        mImgBtnLose = findViewById(R.id.imageLose);
        mImgBtnWin = findViewById(R.id.imageWin);

        mRandom = new Random();

        mNumber1 = mRandom.nextInt(9) + 1;
        mNumber2 = mRandom.nextInt(9) + 1;
        mIsTrue = mRandom.nextBoolean();
        mIndexCalculator = mRandom.nextInt(4);


        switch (mIndexCalculator) {
            case 0:
                mResult = mNumber1 + mNumber2;
                mTvCalculator.setText(mNumber1 + " + " + mNumber2);
                break;
            case 1:
                mResult = mNumber1 - mNumber2;
                mTvCalculator.setText(mNumber1 + " - " + mNumber2);
                break;
            case 2:
                mResult = mNumber1 * mNumber2;
                mTvCalculator.setText(mNumber1 + " * " + mNumber2);
                break;
            case 3:
                mResult = mNumber1 / mNumber2;
                mTvCalculator.setText(mNumber1 + " / " + mNumber2);
                break;
        }

        if (!mIsTrue) {
            mResult += mRandom.nextInt(10) + 1;
        }
        mTvResult.setText(" = " + mResult);
        // random 2 số ngẫu nhiên
        // random 1 toán tử ngẫu nhiên
        // random kết quả


    }
}