package com.yangqichao.democenter;

import android.os.Bundle;
import android.widget.TextView;

import com.yangqichao.commonlib.base.BaseActivity;
import com.yangqichao.commonlib.net.CommonsSubscriber;
import com.yangqichao.commonlib.net.RequestUtil;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.vfvfvvf)
    TextView vfvfvvf;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        RequestUtil.createApi().searchPatentAppPic().compose(RequestUtil.<String>handleResult())
                .subscribe(new CommonsSubscriber<String>() {
                    @Override
                    protected void onSuccess(String patentMenuBean) {
                        showToast(patentMenuBean);
                    }
                });
    }

}
