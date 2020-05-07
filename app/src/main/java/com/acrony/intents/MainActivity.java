package com.acrony.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnJump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJump=(Button) findViewById(R.id.btn1);

       btnJump.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),Activity2.class);
              i.putExtra("Name","Lalita");
               startActivity(i);

             /*  Intent ii=new Intent(Intent.ACTION_VIEW);
               Uri.parse("www.google.com");
               startActivity(ii);*/
              // Intent ii=new Intent(Intent.ACTION_SEND,Uri.parse("mailto:"));
              // startActivity(Intent.createChooser(ii,"Chooose and Email"));

           }
       });

    }
}
