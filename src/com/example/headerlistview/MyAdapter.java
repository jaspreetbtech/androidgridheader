package com.example.headerlistview;

import java.util.ArrayList;

 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<Model> {

	private final Context context;
	private final ArrayList<Model> modelsArrayList;

	public MyAdapter(Context context, ArrayList<Model> modelsArrayList) {
		 
		super(context, R.layout.row, modelsArrayList);
		
		this.context = context;
		this.modelsArrayList = modelsArrayList;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    
		// 1. Create inflater 
		LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    
		// 2. Get rowView from inflater
		
		View rowView = null;
		if(!modelsArrayList.get(position).isGroupHeader()){
			rowView = inflater.inflate(R.layout.row, parent, false);
		
			// 3. Get icon,title & counter views from the rowView
			ImageView imgView1 = (ImageView) rowView.findViewById(R.id.imageView1); 
			TextView titleView1 = (TextView) rowView.findViewById(R.id.textView1);
			
	    
		    // 4. Set the text for textView 
		    imgView1.setImageResource(modelsArrayList.get(position).getIcon());
		    titleView1.setText(modelsArrayList.get(position).getTitle());
		    
		}
		else{
				rowView = inflater.inflate(R.layout.header, parent, false);
				TextView titleView = (TextView) rowView.findViewById(R.id.header1);
		 

		}
	   
	    // 5. retrn rowView
	    return rowView;
	}
}
