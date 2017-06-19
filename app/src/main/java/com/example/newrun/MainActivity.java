package com.example.newrun;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.newrun.com.example.newrun.fragment.FragmentHome;
import com.example.newrun.com.example.newrun.fragment.FragmentMy;
import com.example.newrun.com.example.newrun.fragment.FragmentRank;
import com.example.newrun.com.example.newrun.fragment.FragmentRun;
import com.example.newrun.com.example.newrun.fragment.FragmentSetting;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    @ViewInject(R.id.main_bottom_tabs)
    private RadioGroup group;

    @ViewInject(R.id.main_home)
    private RadioButton main_home;

    private FragmentManager fragmentManager;//管理fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewUtils.inject(this);

        fragmentManager = getSupportFragmentManager();
        //设置默认选中
        main_home.setChecked(true);

        group.setOnCheckedChangeListener(this);
        changeFragment(new FragmentHome(), false);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){

            case R.id.main_home:
                changeFragment(new FragmentHome(),true);
                break;
            case R.id.main_my:
                changeFragment(new FragmentMy(),true);
                break;
            case R.id.main_run:
                changeFragment(new FragmentRun(),true);
                break;
            case R.id.main_rank:
                changeFragment(new FragmentRank(),true);
                break;
            case R.id.main_setting:
                changeFragment(new FragmentSetting(),true);
                break;
            default:
                break;

        }

    }//

    public void changeFragment(Fragment fragment , boolean isFirst){

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_content,fragment);

        transaction.commit();

    }


}
