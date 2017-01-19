package me.trojx.dancingnumberview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.trojx.dancingnumber.DancingNumberView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DancingNumberView dancingNumberView= (DancingNumberView) findViewById(R.id.dnv);
        dancingNumberView.setText("2017年12月12日");
        dancingNumberView.dance();
    }
}
