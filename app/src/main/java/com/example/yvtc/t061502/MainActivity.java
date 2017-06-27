package com.example.yvtc.t061502;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("HelloWorld");
    }

    public void click2(View v){
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();
        tv2.setText("Hello,"+str);
    }

    public void click3(View v){
        TextView tv4 = (TextView) findViewById(R.id.textView4);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        EditText ed3 = (EditText) findViewById(R.id.editText3);

        String ans = String.valueOf(Integer.valueOf(ed2.getText().toString()) + Integer.valueOf(ed3.getText().toString()));
        tv4.setText(ans);
    }

    //======
    //=========123123
}
