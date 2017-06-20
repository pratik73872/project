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
 * Created by Pratik.Deshmukh on 17-06-2017.
 */
public class Welcome extends AppCompatActivity {
    TextView t;
    Button btrm;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        TextView textview = new TextView(this);
        textview.setText(R.string.realmadridcf);
        setContentView(textview);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
    }

    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), Home.class);
        startActivity(i);

    }
}




