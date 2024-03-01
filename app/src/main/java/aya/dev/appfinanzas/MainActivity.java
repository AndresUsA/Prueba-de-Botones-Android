package aya.dev.appfinanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this);

        Button btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this);

        Button btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        if (On){
            btn.setText(R.string.txtOff);
        }else {
            btn.setText(R.string.txtOn);
        }
        On = !On;
    }
    boolean On = false;
}