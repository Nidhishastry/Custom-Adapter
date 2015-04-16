package com.redux.kumardivyarajat.parsedemo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.parse.ParseFile;
import com.parse.ParseImageView;

import java.util.List;

/**
 * Created by kumardivyarajat on 15/04/15.
 */
public class CustomAdapter extends BaseAdapter{
    private final static String TAG = CustomAdapter.class.getSimpleName();

    private Context activity;
    private LayoutInflater inflater = null;
    private List<Students> student;
    int layout;

    public CustomAdapter(Context activity, List<Students> Student) {


        this.activity = activity;
        this.student = Student;
        inflater = LayoutInflater.from(activity);
    }

    @Override
    public int getCount() {
        return student.size();
    }

    @Override
    public Object getItem(int position) {
        return student.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    public  class ViewHolder {
        //ImageView imageView ;
        TextView name  ;
        TextView usn ;
        ParseImageView imageView;
        TextView semester  ;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
       View v =view;
        ViewHolder holder = new ViewHolder();

        if (view == null) {
            LayoutInflater li = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.list_item_layout,null);
            holder.name = (TextView)v.findViewById(R.id.name);
            holder.usn = (TextView)v.findViewById(R.id.usn);
            holder.semester = (TextView)v.findViewById(R.id.semester);
            holder.imageView = (ParseImageView)v.findViewById(R.id.imageView);
            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        Students s = new Students();

        s = student.get(position);
        String a =  s.Name;
        Log.d(TAG,a);
        holder.name.setText(s.getName());
        holder.usn.setText(s.getUSN());
        holder.semester.setText(s.getSemester());
        ParseFile imageFile = s.getPic();
        if(imageFile != null)
        {
            holder.imageView.setParseFile(imageFile);
            holder.imageView.loadInBackground();
        }
       // holder.imageView.setImageBitmap(s.getPic());

        Log.d("CustomAdapter.class", "CustomAdapter");

       // imageView.setImageDrawable(s.getPic());
        return v;
    }


}

