package com.luckyboy.simplebutterknife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lucky.simplebutterknife.annotations.SimpleBindView;

public class MainActivity extends AppCompatActivity {
    @SimpleBindView(R.id.tv_center)
    TextView mTvCenter;

    @SimpleBindView(R.id.iv_center)
    ImageView mIvCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimpleButterKnife.bind(this);
        mTvCenter.setText("我是Jack");
    }


}