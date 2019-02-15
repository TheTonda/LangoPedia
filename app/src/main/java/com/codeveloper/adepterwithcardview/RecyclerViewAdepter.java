package com.codeveloper.adepterwithcardview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdepter extends RecyclerView.Adapter<RecyclerViewAdepter.MyHolder> {
    private Context mContext;
    private List<Language> mData;

    public RecyclerViewAdepter() {


    }

    public RecyclerViewAdepter(Context mContext, List<Language> mData) {
        this.mContext=mContext;
        this.mData=mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater= LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.cardview_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder holder, final int position) {
        holder.lang_tv.setText(mData.get(position).getTitle());
        holder.lang_logo.setImageResource(mData.get(position).getThumbnail());
        holder.cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Next_activity.class);
                //setValues to pass
                intent.putExtra("Title",mData.get(holder.getAdapterPosition()).getTitle());
                 mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        TextView lang_tv;
        ImageView lang_logo;
        CardView cardview;

        public MyHolder(View itemView) {
            super(itemView);
            lang_tv= itemView.findViewById(R.id.card_tv);
            lang_logo= itemView.findViewById(R.id.card_img);
            cardview=itemView.findViewById(R.id.card_id);



        }
    }
}
