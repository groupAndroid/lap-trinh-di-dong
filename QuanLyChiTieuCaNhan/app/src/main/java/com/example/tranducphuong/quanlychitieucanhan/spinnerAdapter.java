package com.example.tranducphuong.quanlychitieucanhan;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class spinnerAdapter extends BaseAdapter {

    Context mycontext;
    int mylayout;
    List<String> Array;

    public spinnerAdapter(Context mycontext, int mylayout, List<String> array) {
        this.mycontext = mycontext;
        this.mylayout = mylayout;
        Array = array;
    }

    public Context getMycontext() {
        return mycontext;
    }

    public void setMycontext(Context mycontext) {
        this.mycontext = mycontext;
    }

    public int getMylayout() {
        return mylayout;
    }

    public void setMylayout(int mylayout) {
        this.mylayout = mylayout;
    }

    public List<String> getArray() {
        return Array;
    }

    public void setArray(List<String> array) {
        Array = array;
    }

    @Override
    public int getCount() {
        return Array.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(mylayout,null);
        TextView tv = (TextView)convertView.findViewById(R.id.textview_spin);
        tv.setText(Array.get(position));
        return convertView;
    }
}
