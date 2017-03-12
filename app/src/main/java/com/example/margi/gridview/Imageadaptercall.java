package com.example.margi.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Margi on 18-Jan-17.
 */
public class Imageadaptercall extends BaseAdapter {

    // String[]array = new String[]{"call","alarm","contact","calltone"};

    private Context con;
    //String name1[] = getResources().getstringArray(R.array.name1);
    int[]menu = new int[]{
            R.drawable.call1,
            R.drawable.make_call,
            R.drawable.delete_call,
            R.drawable.back_arrow
    };


    String []name1 = new String[]{
            "call1",
            "make_call",
            "delete_call",
            "back_arrow"


    };
    public Imageadaptercall(Context c)
    {
        con = c;
    }

    @Override
    public int getCount() {
        return menu.length ;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    static class ViewHolder{
        ImageView iconImage;
        TextView categoryText;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        ViewHolder holder;
        if(view==null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(con).inflate(R.layout.single_row_category,viewGroup,false);
            holder.iconImage = (ImageView) view.findViewById(R.id.single_row_image);
            holder.categoryText = (TextView) view.findViewById(R.id.single_row_text);
            view.setTag(holder);
        }else
        {
            holder = (ViewHolder)view.getTag();
        }
        holder.iconImage.setPadding(8,8,8,8);
        holder.iconImage.setImageResource(menu[i]);
        //  String name1[] = getResources().getstringArray(R.array.name1);
        holder.categoryText.setText(name1[i]);
        return view;
    }

}
