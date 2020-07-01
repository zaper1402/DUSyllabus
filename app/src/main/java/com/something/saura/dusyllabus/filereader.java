package com.something.saura.dusyllabus;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class filereader  {

    public static SpannableStringBuilder readWithSpan(Context context,String fileName){
        SpannableStringBuilder text = new SpannableStringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(context.getAssets().open(fileName)));
            String mLine;

            while ((mLine = reader.readLine()) != null) {
                SpannableStringBuilder ss;
                StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
                UnderlineSpan underlineSpan = new UnderlineSpan();
                Boolean boldFlg=false,UnderlineFlg=false;

                if(mLine.length()!=0 && mLine.contains("<b>")){
                    mLine = mLine.replace("<b>","").replace("</b>","").replace("\\n","");
                    boldFlg=true;

                    if(mLine.contains("<u>")) {
                        mLine = mLine.replace("<u>", "").replace("</u>", "");
                        UnderlineFlg = true;
                    }

                }

                ss = new SpannableStringBuilder(mLine);

                if(UnderlineFlg) ss.setSpan(underlineSpan,0,ss.length()-1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                if(boldFlg) ss.setSpan(boldSpan,0,ss.length()-1, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                text.append(ss);
                text.append('\n');
            }
        } catch (IOException e) {
            Toast.makeText(context,"Error reading file!",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        return text;
    }
}
