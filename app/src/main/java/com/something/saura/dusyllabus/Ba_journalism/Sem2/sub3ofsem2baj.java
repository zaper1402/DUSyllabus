package com.something.saura.dusyllabus.Ba_journalism.Sem2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.something.saura.dusyllabus.R;
import com.something.saura.dusyllabus.filereader;

public class sub3ofsem2baj extends AppCompatActivity {
    private AdView mAdView;
    private SpannableStringBuilder text = new SpannableStringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syllabus_page);
        String file = "sample.txt";
        text = filereader.readWithSpan(this,file);
        TextView output= (TextView) findViewById(R.id.textView);
        output.setText((CharSequence) text);

        MobileAds.initialize(this, "ca-app-pub-5207658967392727~2816356292");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-5207658967392727/7442885061");


    }
}
