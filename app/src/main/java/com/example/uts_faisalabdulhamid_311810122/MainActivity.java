package com.example.uts_faisalabdulhamid_311810122;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button starBtn = (Button) findViewById(R.id.sendEmail);
        starBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { sendEmail(); }
        });
    }


    public void panggil(View view) {
        String nomor = "085714764019";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts( "tel", nomor, null));
        startActivity(panggil);
    }
    public void buka(View view){
        String url = "https://www.lazada.com";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }
    public void lihat (View view){
        String url ="https://www.google.co.id/maps/@-6.2721002.107.3257548,15z";
        Intent maps = new Intent(Intent.ACTION_VIEW);
        maps.setData(Uri.parse(url));
        startActivity(maps);
    }
    protected void sendEmail(){
        Log.i("send email","");
        String[] To ={""};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, To);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Your subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message goes here");
        startActivity(emailIntent);
    }
}