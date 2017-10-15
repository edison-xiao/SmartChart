package com.bin.david.smartchart.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.bin.david.smartchart.R;
import com.bin.david.smartchart.bean.MainItem;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by huang on 2017/10/13.
 */

public class ItemAdapter extends BaseQuickAdapter<MainItem,BaseViewHolder> {


    public ItemAdapter( @Nullable List<MainItem> data) {
        super(R.layout.item_main, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainItem item) {
        helper.setText(R.id.tv_chart_name,item.chartName);
    }
}