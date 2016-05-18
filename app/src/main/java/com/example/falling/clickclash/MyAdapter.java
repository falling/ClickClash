package com.example.falling.clickclash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by falling on 16/5/18.
 */
public class MyAdapter extends BaseAdapter {

    private List<Object> mContent = new ArrayList<>();

    public MyAdapter() {
        mContent.add(new Object());
        mContent.add(new Object());
        mContent.add(new Object());
        mContent.add(new Object());
    }

    @Override
    public int getCount() {
        return mContent.size();
    }

    @Override
    public Object getItem(int position) {
        return mContent.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mButton = (Button) convertView.findViewById(R.id.button);
            viewHolder.mTextView = (TextView) convertView.findViewById(R.id.text);
            viewHolder.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Button's click", Toast.LENGTH_SHORT).show();
                }
            });

            viewHolder.mTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "text's click", Toast.LENGTH_SHORT).show();
                }
            });
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    class ViewHolder {
        Button mButton;
        TextView mTextView;
    }
}
