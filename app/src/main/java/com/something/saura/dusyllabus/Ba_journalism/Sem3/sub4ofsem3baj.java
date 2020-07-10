package com.something.saura.dusyllabus.Ba_journalism.Sem3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

import com.something.saura.dusyllabus.R;
import com.something.saura.dusyllabus.filereader;

public class sub4ofsem3baj extends AppCompatActivity {
    private SpannableStringBuilder text = new SpannableStringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.syllabus_page);
        String file = "sample.txt";
        text = filereader.readWithSpan(this,file);
        TextView output= (TextView) findViewById(R.id.textView);
        output.setText((CharSequence) text);

    }
}
