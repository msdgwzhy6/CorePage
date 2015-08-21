package cn.edu.zafu.corepage.sample;

import android.content.Intent;
import android.os.Bundle;

import cn.edu.zafu.corepage.base.BaseActivity;
import cn.edu.zafu.corepage.core.CoreAnim;
import cn.edu.zafu.corepage.core.CoreConfig;


public class MainActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CoreConfig.setIsOpenAtlas(true);
        openPage("main", null, CoreAnim.none);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
