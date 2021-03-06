package com.example.chunyu.demotest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.chunyu.demotest.ndk.TestNdk;

/**
 * Created by chunyu on 2017/7/21.
 */

public class NdkActivity extends AppCompatActivity {

    TextView mTextView;

    static {
        System.loadLibrary("jni-test");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ndk_activity_layout);
        initView();
    }

    private void initView() {

        mTextView = (TextView) findViewById(R.id.ndk_text);

        TestNdk testNdk = new TestNdk();

        mTextView.setText(testNdk.getfriend());
    }


}
