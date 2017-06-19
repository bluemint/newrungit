package com.example.newrun.fragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newrun.R;
import com.example.newrun.fragment.data.Mylist;

import java.util.List;

/**
 * Created by nana on 2017/6/7.
 */


public class MylistAdapter extends ArrayAdapter<com.example.newrun.fragment.data.Mylist> {
    private int resourceId;
    public MylistAdapter(Context context, int textViewResourceId,
                       List<Mylist> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Mylist mList = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView listImage = (ImageView) view.findViewById(R.id.list_image);
        TextView listName = (TextView) view.findViewById(R.id.list_name);
        listImage.setImageResource(mList.getImageId());
        listName.setText(mList.getName());
        return view;
    }
}
