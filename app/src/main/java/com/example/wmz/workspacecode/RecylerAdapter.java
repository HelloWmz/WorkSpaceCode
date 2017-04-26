package com.example.wmz.workspacecode;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 * 适配器
 */

class RecylerAdapter extends RecyclerView.Adapter {

    private Context context;

    RecylerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyler_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    private class Holder extends RecyclerView.ViewHolder {

        Holder(View itemView) {
            super(itemView);
        }

    }
}
