package com.yangqichao.democenter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yangqichao.democenter.common.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @BindView(R.id.vfvfvvf)
    TextView vfvfvvf;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        showToast("DEBUG:" + BuildConfig.DEBUG + "\n BUILD_TYPE:" + BuildConfig.BUILD_TYPE + "\n VERSION_CODE:" + BuildConfig.VERSION_CODE);
        showToast(BuildConfig.BaseUrl);

    }


    @OnClick({R.id.button, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                showToast("1111111");
                break;
            case R.id.button2:
                showToast("2222222");
                break;
        }
    }
}
