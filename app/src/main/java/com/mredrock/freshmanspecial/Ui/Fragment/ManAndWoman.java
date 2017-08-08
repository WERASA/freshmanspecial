package com.mredrock.freshmanspecial.ui.Fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mredrock.freshmanspecial.model.Special_2017_Circle;
import com.mredrock.freshmanspecial.R;
import com.mredrock.freshmanspecial.ui.View.Special_2017_MyCircleView;

/**
 * Created by Administrator on 2017/8/3 0003.
 */

public class ManAndWoman extends Fragment {
    private ViewDataBinding binding;

    private Special_2017_MyCircleView redCircleView;
    private Special_2017_MyCircleView blueCircleView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_special_2017_man_and_woman,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        blueCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_man_and_woman_blue);
        blueCircleView.setCircle(new Special_2017_Circle(60,60,"#b9e7fe","#7ac9eb","#f8fdfe","#ccf5ff"));
        redCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_man_and_woman_red);
        redCircleView.setCircle(new Special_2017_Circle(80,60,"#ffabc8","#FFD2E3","#fffeff","#fff4f5"));
    }
}
