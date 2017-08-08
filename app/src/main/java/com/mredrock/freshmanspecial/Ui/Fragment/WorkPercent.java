package com.mredrock.freshmanspecial.ui.Fragment;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bigkoo.pickerview.OptionsPickerView;
import com.mredrock.freshmanspecial.BR;
import com.mredrock.freshmanspecial.model.Special_2017_Circle;
import com.mredrock.freshmanspecial.R;
import com.mredrock.freshmanspecial.ui.View.Special_2017_MyCircleView;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/3 0003.
 */

public class WorkPercent extends Fragment {
    private ViewDataBinding binding;
    private OptionsPickerView mPickerView;
    private Special_2017_MyCircleView greenCircleView;
    private Special_2017_MyCircleView blueCircleView;
    private ArrayList<String> optionItems ;
    private TextView mTextView ;
    public ViewDataBinding getBinding() {
        return binding;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_special_2017_work_percent,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initOptionItems();
        initOptionPicker();
        mTextView = (TextView)binding.getRoot().findViewById(R.id.special_2017_data_work_percent_academy_text);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPickerView.show();
            }
        });
        blueCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_work_percent_blue);
        blueCircleView.setCircle(new Special_2017_Circle(60,60,"#b9e7fe","#7ac9eb","#f8fdfe","#ccf5ff"));
        greenCircleView = (Special_2017_MyCircleView)binding.getRoot().findViewById(R.id.special_2017_data_work_percent_green);
        greenCircleView.setCircle(new Special_2017_Circle(80,60,"#9EFCEE","#6decd6","#f8fffe","#defffa"));
    }

    public void initOptionItems(){
        optionItems = new ArrayList<>();
        optionItems.add("计算机");
        optionItems.add("自动化");
        optionItems.add("通信");
        optionItems.add("传媒");
        optionItems.add("光电");
        optionItems.add("软件");

    }
    public void initOptionPicker(){
        mPickerView = new OptionsPickerView.Builder(this.getContext(), new OptionsPickerView.OnOptionsSelectListener() {
            @Override
            public void onOptionsSelect(int options1, int options2, int options3, View v) {
                String tx = optionItems.get(options1);
                binding.setVariable(BR.special_2017_man_and_woman_academy,tx);
                binding.invalidateAll();
            }
        }).setContentTextSize(16)
                .setSubCalSize(14)
                .setSubmitText("完成")
                .setSubmitColor(Color.parseColor("#81C0FE"))
                .isDialog(false)
                .build();
        mPickerView.setPicker(optionItems);
    }

}
