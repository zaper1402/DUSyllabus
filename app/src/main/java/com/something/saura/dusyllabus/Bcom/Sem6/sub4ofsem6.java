package com.something.saura.dusyllabus.Bcom.Sem6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.something.saura.dusyllabus.R;

public class sub4ofsem6 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bcom_sub4ofsem6);

        MobileAds.initialize(this, "ca-app-pub-5207658967392727~2816356292");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5207658967392727/7442885061");

        Button btn1=(Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(getApplicationContext(),sub4aofsem6.class);
                startActivity(int1);
            }
        });
        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(getApplicationContext(),sub4bofsem6.class);
                startActivity(int2);
            }
        });
        Button btn3 =(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(getApplicationContext(),sub4cofsem6.class);
                startActivity(int3);
            }
        });
        Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(getApplicationContext(),sub4dofsem6.class);
                startActivity(int4);
            }
        });
        Button btn5= (Button)findViewById(R.id.button7);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5= new Intent(getApplicationContext(),sub4eofsem6.class);
                startActivity(int5);
            }
        });
        Button btn6=(Button)findViewById(R.id.button8);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(getApplicationContext(),sub4fofsem6.class);
                startActivity(int6);
            }
        });
        Button btn7=(Button)findViewById(R.id.button9);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(getApplicationContext(),sub4gofsem6.class);
                startActivity(int7);
            }
        });
        Button btn8=(Button)findViewById(R.id.button11);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(getApplicationContext(),sub4hofsem6.class);
                startActivity(int8);
            }
        });
        Button btn9=(Button)findViewById(R.id.button12);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(getApplicationContext(),sub4iofsem6.class);
                startActivity(int9);
            }
        });

    }
}
