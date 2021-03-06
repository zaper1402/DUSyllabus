package com.something.saura.dusyllabus.Main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.something.saura.dusyllabus.R;
import com.something.saura.dusyllabus.more;
import com.something.saura.dusyllabus.Ba_journalism.Sem1.subofsem1baj;
import com.something.saura.dusyllabus.Ba_journalism.Sem2.subofsem2baj;
import com.something.saura.dusyllabus.Ba_journalism.Sem3.subofsem3baj;
import com.something.saura.dusyllabus.Ba_journalism.Sem4.subofsem4baj;
import com.something.saura.dusyllabus.Ba_journalism.Sem5.subofsem5baj;
import com.something.saura.dusyllabus.Ba_journalism.Sem6.subofsem6baj;

public class mainaactivity3 extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MobileAds.initialize(this, "ca-app-pub-5207658967392727~2816356292");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5207658967392727/7442885061");

        Button btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1=new Intent(getApplicationContext(),subofsem1baj.class);
                startActivity(int1);
            }
        });
        Button btn2 =(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(getApplicationContext(),subofsem2baj.class);
                startActivity(int2);
            }
        });
        Button btn3=(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(getApplicationContext(),subofsem3baj.class);
                startActivity(int3);
            }
        });
        Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(getApplicationContext(),subofsem4baj.class);
                startActivity(int4);
            }
        });
        Button btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(getApplicationContext(),subofsem5baj.class);
                startActivity(int5);
            }
        });
        Button btn6=(Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(getApplicationContext(),subofsem6baj.class);
                startActivity(int6);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu manu){
        getMenuInflater().inflate(R.menu.main, manu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if(id==R.id.id_more){
            Intent intmore=new Intent(mainaactivity3.this,more.class);
            startActivity(intmore);
            return true;
        }
        return true;
    }
}
