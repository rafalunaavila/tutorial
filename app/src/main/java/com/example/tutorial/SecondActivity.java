package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tView=(TextView)findViewById(R.id.textView);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            String greeter = bundle.getString("greeter");
            Toast.makeText(SecondActivity.this, greeter, Toast.LENGTH_LONG).show();
            tView.setText(greeter);
        }
        else
            Toast.makeText(SecondActivity.this,"empty",Toast.LENGTH_LONG).show();
    }
}
