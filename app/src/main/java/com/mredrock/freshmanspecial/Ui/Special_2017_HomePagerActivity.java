package com.mredrock.freshmanspecial.ui;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mredrock.freshmanspecial._interface.Presenterable;
import com.mredrock.freshmanspecial.R;
import com.mredrock.freshmanspecial.databinding.ActivitySpecial2017HomePagerBinding;

public class Special_2017_HomePagerActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySpecial2017HomePagerBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_special_2017__home_pager);
        binding.setOnClick(new Presenter());
    }
    public class Presenter implements Presenterable {
        @Override
        public void onBack() {
            finish();
        }
        public void onStrategyClick(){
            startActivity(new Intent(Special_2017_HomePagerActivity.this,Special_2017_StrategyActivity.class));
        }
        public void onDataClick(){
            startActivity(new Intent(Special_2017_HomePagerActivity.this,Special_2017_DataActivity.class));
        }
    }
}
