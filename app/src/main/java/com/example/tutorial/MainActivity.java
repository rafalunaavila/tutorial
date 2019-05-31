package com.example.tutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int result=check();
        //Toast.makeText(this, "toast" + result, Toast.LENGTH_LONG).show();
        /*Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("greeter", "hello");
                startActivity(intent);
            }
        });*/
        listView=(ListView)findViewById(R.id.listView);


    }

    public void miMetodo(View view){
        int a=4;
        Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();
    }

    @Override protected void onRestart() {
        super.onStart();
        //Toast.makeText(this, "onRestart",Toast.LENGTH_LONG).show();
    }

    private int check() {
        int a = 5;
        int b = 10;
        int c = 20;

        if(a < b) {
            return 0;
        }
        else
            if(a>c)
                return a;
            else
                return c;

    }
}
