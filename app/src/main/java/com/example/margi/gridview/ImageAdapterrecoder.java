package com.example.margi.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Margi on 08-Mar-17.
 */
public class ImageAdapterrecoder extends BaseAdapter
{
    private Context con;
    int recorder[] = new int[]{
            R.drawable.create_recorder,
            R.drawable.recorder_list,
            R.drawable.back_arrow,
    };
    String name[] = new String[]{
            "Create_Recorder",
            "Recorder_List",
            "Back",
    };

    public ImageAdapterrecoder(Context c)
    {
        con = c;
    } {
    }

    @Override
    public int getCount() {
        return recorder.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    static class ViewHolder {
        ImageView iconImage;
        TextView categoryText;
    }



    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(con).inflate(R.layout.single_row_category,viewGroup, false);
            holder.iconImage = (ImageView)view.findViewById(R.id.single_row_image);
            holder.categoryText = (TextView) view.findViewById(R.id.single_row_text);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder)view.getTag();
        }
        holder.iconImage.setPadding(3,3,3, 3);
        holder.iconImage.setImageResource(recorder[i]);
        holder.categoryText.setText(name[i]);
        return view;
    }
    }
