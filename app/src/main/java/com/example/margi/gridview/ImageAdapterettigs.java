package com.example.margi.gridview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Margi on 08-Mar-17.
 */
public class ImageAdapterettigs extends BaseAdapter
{
    private Context con;
    int setting[] = new int[]{
            R.drawable.readind_speed,
            R.drawable.alaram,
            R.drawable.call_tone,
            R.drawable.wifi,
            R.drawable.screen_timeout,
    };
    String name[] = new String[]{
            "Reading_spped",
            "Alaram",
            "Call_tone",
            "WiFi",
            "Scrren_timeout",
    };
    public ImageAdapterettigs(Context c) {
        con = c;
    }
    @Override
    public int getCount() {
        return setting.length;
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
        return null;
    }
}
