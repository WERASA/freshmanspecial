package com.mredrock.freshmanspecial.Ui.Fragment;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.mredrock.freshmanspecial.Model.Special_2017_Circle;
import com.mredrock.freshmanspecial.R;
import com.mredrock.freshmanspecial.Ui.View.Special_2017_MyCircleView;

/**
 * Created by Administrator on 2017/8/3 0003.
 */

public class TheHardestObject<T extends ViewDataBinding> extends Fragment {
    ViewDataBinding binding;
    Special_2017_MyCircleView yellowCircleView;
    Special_2017_MyCircleView greenCircleView;
    Special_2017_MyCircleView blueCircleView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_special_2017_the_hardest_object,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        yellowCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_the_hardest_object_yellow);
        yellowCircleView.setCircle(new Special_2017_Circle(100,60,"#FBFEB9","#f1e28c","#fffffb","#fbf9e3"));
        blueCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_the_hardest_object_blue);
        blueCircleView.setCircle(new Special_2017_Circle(60,60,"#B9E5FE","#7ac9eb","#f8fdfe","#ccf5ff"));
        greenCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_the_hardest_object_green);
        greenCircleView.setCircle(new Special_2017_Circle(80,60,"#9dfced","#6de9d7","#f8fffe","#d7fff7"));
    }
}
