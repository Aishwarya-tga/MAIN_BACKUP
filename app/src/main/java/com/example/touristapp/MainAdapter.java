package com.example.touristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MainAdapter extends BaseExpandableListAdapter {

    Context context;
    List<String> listGroup;
    HashMap<String, List<String>> listItem;

    public MainAdapter(Context context , List<String> listGroup,HashMap<String,List<String>> listItem) {
        this.context = context;
        this.listGroup = listGroup;
        this.listItem = listItem;
    }


    @Override
    public int getGroupCount() {
        return listGroup.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listItem.get(this.listGroup.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listGroup.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listItem.get(this.listGroup.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isexpanded, View Convertview, ViewGroup parent) {
        String group = (String) getGroup(groupPosition);
        if(Convertview == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Convertview = layoutInflater.inflate(R.layout.main_list,null);
        }
        TextView textView = Convertview.findViewById(R.id.list_main);
        textView.setText(group);
        return Convertview;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View Convertview, ViewGroup parent) {
        String child = (String) getChild(groupPosition,childPosition);
        if(Convertview == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            Convertview = layoutInflater.inflate(R.layout.values_list,null);
        }
        TextView textView = Convertview.findViewById(R.id.list_values);
        textView.setText(child);
        return Convertview;

    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
