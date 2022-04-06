package com.myapp.myfashionsketch.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myapp.myfashionsketch.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyView> {
    public List<String> dataList;

    public HorizontalAdapter(List<String> dataSet){
        dataList = dataSet;
    }

    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, int position) {
        String listData = dataList.get(position);
        Picasso.get().load(listData).placeholder(R.mipmap.ic_launcher).into(holder.subjectImageView);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    // This is a template - give a direct reference to each view
    public class MyView extends RecyclerView.ViewHolder{
        public ImageView subjectImageView;

        // Constructor - accepts entire row item
        public MyView(@NonNull View itemView) {
            super(itemView);

            // Find each view by id you set up in the list_item.xml
            subjectImageView = itemView.findViewById(R.id.detailedView);
        }
    }
}