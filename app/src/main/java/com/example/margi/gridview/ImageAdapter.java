package com.example.margi.gridview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Margi on 03-Jan-17.
 */

public class ImageAdapter extends BaseAdapter {

   // String[]array = new String[]{"call","alarm","contact","calltone"};

    private  Context con;
    //String name1[] = getResources().getstringArray(R.array.name1);
     int[]menu = new int[]{
            R.drawable.msg,
            R.drawable.call,
            R.drawable.contact,
            R.drawable.music,
            R.drawable.alaram,
            R.drawable.recorder,
            R.drawable.settings , R.drawable.status,

     };


  String []name1 = new String[]{
           "msg",
           "call",
           "contact",
          "music",
          "alaram",
          "recorder",
          "settings",
          "Status"


   };
    public ImageAdapter(Context c)
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
        holder.categoryText.setText(name1[i]);
        return view;
    }

    }

