package com.example.newrun.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newrun.R;

/**
 * Created by Administrator on 2017/4/21.
 */

public class FragmentRank extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //我的
        View view = inflater.inflate(R.layout.index_rank,null);
        return view;

    }
}
