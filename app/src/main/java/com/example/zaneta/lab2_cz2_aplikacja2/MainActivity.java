package com.example.zaneta.lab2_cz2_aplikacja2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uruchomBMR(View view)
    {
        String kolejne = "com.example.zaneta.lab2_cz2.intent.action.kolejne";
        Intent iii = new Intent(kolejne);
        startActivity(iii);
    }

    public void uruchomTelefon(View view)
    {
        Intent iii= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:872564053"));
        startActivity(iii);
    }

    public void uruchomZdjecia(View view)
    {
        Intent i = new Intent();
        Intent iii = new Intent();
        iii.setType("image/pictures/*");
        iii.setAction(Intent.ACTION_GET_CONTENT);
        startActivity(iii);
    }

    public void uruchomInternet(View view)
    {
        Intent iii= new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.pl/"));
        startActivity(iii);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Hasta la vista!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "I’ll be back!!!", Toast.LENGTH_SHORT).show();
    }
}
