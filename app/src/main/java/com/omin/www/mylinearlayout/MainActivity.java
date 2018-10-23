package com.omin.www.mylinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClicked(View v) {
        if(v.getId()==R.id.button1) {
            Toast.makeText(getApplicationContext(), "버튼1이 눌렸습니다.", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.button2) {
            Toast.makeText(getApplicationContext(), "버튼2이 눌렸습니다.", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.button3) {
            Toast.makeText(getApplicationContext(), "버튼3이 눌렸습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClicked1(View v) {
        Toast.makeText(getApplicationContext(), "버튼1이 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onClicked2(View v) {
        Toast.makeText(getApplicationContext(), "버튼2이 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }

    public void onClicked3(View v) {
        Toast.makeText(getApplicationContext(), "버튼3이 눌렸습니다.", Toast.LENGTH_SHORT).show();
    }
}
