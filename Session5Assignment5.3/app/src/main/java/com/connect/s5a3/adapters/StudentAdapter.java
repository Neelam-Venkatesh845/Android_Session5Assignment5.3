package com.connect.s5a3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.connect.s5a3.R;
import com.connect.s5a3.model.Student;
import com.connect.s5a3.MainActivity;
import com.connect.s5a3.model.Student;

import java.util.ArrayList;

/**
 * Created by win7 on 28-09-2016.
 */

public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> mArrayList;
    LayoutInflater mLayoutInflater;

    public StudentAdapter(Context context, ArrayList<Student> mArrayList) {
        this.mArrayList=mArrayList;
        this.mLayoutInflater=LayoutInflater.from(context);
    }



    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=mLayoutInflater.inflate(R.layout.customlistview,parent,false);

        Student student= (Student)getItem(position);

        TextView name=(TextView)convertView.findViewById(R.id.name);
        TextView phone1=(TextView)convertView.findViewById(R.id.phone);

        name.setText(student.getName());

        phone1.setText(String.valueOf(student.getPhone()));

        return convertView;
    }
}
