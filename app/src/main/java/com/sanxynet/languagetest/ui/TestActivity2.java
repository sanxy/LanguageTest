package com.sanxynet.languagetest.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;

import com.sanxynet.languagetest.R;

public class TestActivity2 extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity_2);
        //noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}