package com.something.saura.dusyllabus.Pol_sci.Sem4;

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

public class subofsem4pol extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.polsci_subofsem4);

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
                Intent int1=new Intent(getApplicationContext(),sub1ofsem4pol.class);
                startActivity(int1);
            }
        });
        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2=new Intent(getApplicationContext(),sub2ofsem4pol.class);
                startActivity(int2);
            }
        });
        Button btn3 =(Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3=new Intent(getApplicationContext(),sub3ofsem4pol.class);
                startActivity(int3);
            }
        });
        Button btn4=(Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4=new Intent(getApplicationContext(),sub4ofsem4pol.class);
                startActivity(int4);
            }
        });
        Button btn5=(Button)findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5=new Intent(getApplicationContext(),sub5ofsem4pol.class);
                startActivity(int5);
            }
        });
        Button btn6=(Button)findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6=new Intent(getApplicationContext(),sub6ofsem4pol.class);
                startActivity(int6);
            }
        });
        Button btn7=(Button)findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7=new Intent(getApplicationContext(),sub7ofsem4pol.class);
                startActivity(int7);
            }
        });
        Button btn8=(Button)findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8=new Intent(getApplicationContext(),sub8ofsem4pol.class);
                startActivity(int8);
            }
        });
        Button btn9=(Button)findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9=new Intent(getApplicationContext(),sub9ofsem4pol.class);
                startActivity(int9);
            }
        });
        Button btn10=(Button)findViewById(R.id.button10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10=new Intent(getApplicationContext(),sub10ofsem4pol.class);
                startActivity(int10);
            }
        });
        Button btn11=(Button)findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11=new Intent(getApplicationContext(),sub11ofsem4pol.class);
                startActivity(int11);
            }
        });
        Button btn12=(Button)findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12=new Intent(getApplicationContext(),sub12ofsem4pol.class);
                startActivity(int12);
            }
        });
        Button btn13=(Button)findViewById(R.id.button13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13=new Intent(getApplicationContext(),sub13ofsem4pol.class);
                startActivity(int13);
            }
        });
        Button btn14=(Button)findViewById(R.id.button14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int14=new Intent(getApplicationContext(),sub14ofsem4pol.class);
                startActivity(int14);
            }
        });
        Button btn15=(Button)findViewById(R.id.button15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int15=new Intent(getApplicationContext(),sub15ofsem4pol.class);
                startActivity(int15);
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
            Intent intmore=new Intent(subofsem4pol.this,more.class);
            startActivity(intmore);
            return true;
        }
        return true;
    }
}
