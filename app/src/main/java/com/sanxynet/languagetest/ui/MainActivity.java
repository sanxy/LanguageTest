package com.sanxynet.languagetest.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.widget.TextView;

import com.sanxynet.languagetest.R;
import com.sanxynet.languagetest.WebViewLocaleHelper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        WebViewLocaleHelper helper = new WebViewLocaleHelper();

        findViewById(R.id.activity_1).setOnClickListener(v -> startActivity(new Intent(this, TestActivity1.class)));
        findViewById(R.id.activity_2).setOnClickListener(v -> startActivity(new Intent(this, TestActivity2.class)));
        findViewById(R.id.web_view).setOnClickListener(v -> {
            helper.implementWorkaround(this);
            startActivity(new Intent(this, WebViewActivity.class));
        });

        findViewById(R.id.settings).setOnClickListener(v -> startActivity(new Intent(this, SettingsActivity.class)));

        TextView tv = findViewById(R.id.hello);
        String date = SimpleDateFormat.getDateInstance().format(new Date());
        tv.setText(getString(R.string.hello, date));
    }
}