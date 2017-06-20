package com.pladatechnologies.signup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * Created by Pratik.Deshmukh on 09-06-2017.
 */
public class Home extends AppCompatActivity {
    Button bt1;
    RadioButton rb1, rb2;
    private EditText ename, ephone, eadd, egen;
    private String sname, sphone, sadd, stemail, stpassword;
    private EditText etmail;
    private EditText etpass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        ename = (EditText) findViewById(R.id.et_name);
        ephone = (EditText) findViewById(R.id.et_phone);
        eadd = (EditText) findViewById(R.id.et_add);
        bt1 = (Button) findViewById(R.id.button);
        Log.d("Home", "Home");



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sname = ename.getText().toString();
                String sphone = ephone.getText().toString();
                String sadd = eadd.getText().toString();
                Intent i = new Intent(getApplicationContext(), Welcome.class);
                i.putExtra("Value1", getString(R.string.realmadrid));
                startActivity(i);


            }
        });

    }


//    private void setContentView(int activity_signup) {
//        rb1 =(Button)findViewById(R.id.button);
//        tname=(TextView)findViewById(R.id.tv_name);
//    }


}
