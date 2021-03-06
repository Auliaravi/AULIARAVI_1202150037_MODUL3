package com.tugas6.auliaravi.auliaravi_1202150037_m3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class waterAdapter extends RecyclerView.Adapter<waterAdapter.WaterViewHolder> {
    private ArrayList<water> mWaterData;
    private Context context;

    public waterAdapter(Context context, ArrayList<water> waters) {
        this.context = context;
        mWaterData = waters;
    }

    @Override
    public WaterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WaterViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(WaterViewHolder holder, int position) {
        water currentWater = mWaterData.get(position);
        holder.bindTo(currentWater);
    }

    @Override
    public int getItemCount() {
        return mWaterData.size();
    }

    class WaterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitle, mDescription;
        ImageView mWatersImage;
        public WaterViewHolder(View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mDescription = itemView.findViewById(R.id.subTitle);
            mWatersImage = itemView.findViewById(R.id.watersImage);
            itemView.setOnClickListener(this);
        }

        void bindTo(water currentWater) {
            mTitle.setText(currentWater.getTitle());
            mDescription.setText(currentWater.getDescpription());
            mWatersImage.setImageResource(currentWater.getImage());
        }
        //pembuatan set title,image,detail

        @Override
        public void onClick(View view) {
            water currentWater = mWaterData.get(getAdapterPosition());
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("title", currentWater.getTitle());
            intent.putExtra("image", currentWater.getImage());
            intent.putExtra("detail", currentWater.getDetail());
            //pembuatan title,image,detail
            context.startActivity(intent);

        }
    }
}