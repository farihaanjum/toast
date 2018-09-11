package com.example.iiucuser2.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button heartbutton,sharebutton,chatbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heartbutton=(Button)findViewById(R.id.btnheart);
        sharebutton=(Button)findViewById(R.id.btnshare);
        chatbutton=(Button)findViewById(R.id.btnchat);

        chatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast3();
            }
        });

        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast1();
            }
        });

        heartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });
    }

    public void showToast3(){

        LayoutInflater inflater = getLayoutInflater();
        View layout= inflater.inflate(R.layout.toast3,(ViewGroup) findViewById(R.id.toastlayout3));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }

    public void showToast1(){
        LayoutInflater inflater = getLayoutInflater();
        View layout= inflater.inflate(R.layout.toast1,(ViewGroup) findViewById(R.id.toastlayout));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();

    }


    public void showToast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout= inflater.inflate(R.layout.toast,(ViewGroup) findViewById(R.id.toastlayout2));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }
}
