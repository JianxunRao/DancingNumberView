package me.trojx.dancingnumberview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import me.trojx.dancingnumber.DancingNumberView;

public class MainActivity extends AppCompatActivity {

    private DancingNumberView dancingNumberView;
    private EditText etDuration;
    private EditText etFormat;
    private Button btStart;
    private EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dancingNumberView = (DancingNumberView) findViewById(R.id.dnv);
        etText = (EditText) findViewById(R.id.et_text);
        etDuration = (EditText) findViewById(R.id.et_duration);
        etFormat = (EditText) findViewById(R.id.et_format);
        btStart = (Button) findViewById(R.id.bt_start);
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String durationString=etDuration.getText().toString();
                if (durationString.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please set duration to dance.", Toast.LENGTH_SHORT).show();
                }
                int duration=Integer.parseInt(durationString);
                String format= etFormat.getText().toString();
                if (format.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please set format for number.", Toast.LENGTH_SHORT).show();
                }
                String text=etText.getText().toString();
                dancingNumberView.setText(text);
                dancingNumberView.setDuration(duration);
                dancingNumberView.setFormat(format);
                dancingNumberView.dance();
            }
        });

        etText.setText(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss.SSS秒").format(new Date()));
    }
}
