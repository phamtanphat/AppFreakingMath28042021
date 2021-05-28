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
//        Random random = new Random();
//        for (int i = 0; i < 50 ; i++) {
//            // (smax - smin + 1) + smin
//            int number6 = random.nextInt(10 - 5 + 1) + 5;
//            Log.d("BBB",number6 + "");
//        }

        // Mảng trong java
        // Array
        // Khai bao 1 mảng với kích cố định
//        String arrNames[] = new String[5];
//        // gán giá trị cho phần tử
//        // vị trí của các phần tử nó sẽ bắt đầu từ 0
//
//        arrNames[0] = "A";
//        arrNames[1] = "B";
//        arrNames[2] = "C";
//        arrNames[3] = "D";
//        arrNames[4] = "E";
//
//        Log.d("BBB",arrNames[0]);
//        0 1 2 3 4
//        1 2 3 4 5

        // Yêu cầu tạo ra 1 mảng gồm 20 phần tử và giá trị 20 phần tử này là ngẫu nhiên từ 0 -> 100
//        int arrNumbers[] = new int[20];
//
//        for (int i = 0 ; i < arrNumbers.length ; i++){
//            arrNumbers[i] = new Random().nextInt(101);
//            Log.d("BBB",arrNumbers[i] + "");
//        }

        // Yêu cầu tạo ra 1 mảng gồm 10 phần tử chạy random 1 - > 10
        // Ví dụ mình cho giá trị là ngẫu nhiên từ 1 -> 10 (5) sẽ kiếm cho số 5 có tồn tại trong mảng hay không và
        // xuất hiện mấy lần và in ra vị trí mà nó xuất hiện

        int count = 0;
        int valueRandom = 0;
        String textIndexAppearance = "";
        int arrNumbers[] = new int[10];

        valueRandom = new Random().nextInt(11);
        for (int i = 0; i < arrNumbers.length ; i++) {
            arrNumbers[i] = new Random().nextInt(11);
            Log.d("BBB" ," Giá trị trong mảng " + arrNumbers[i]);
            if (arrNumbers[i] == valueRandom){
                count++;
                textIndexAppearance += " " + (i + 1);
            }

        }
        if (count == 0){
            Log.d("BBB", "Giá trị " + valueRandom + " không xuất hiện lần nào");
        }else{
            Log.d("BBB","Giá trị " + valueRandom + " đã xuất hiện " + count + " lần , ở các vị trí " + textIndexAppearance);
        }
    }
}