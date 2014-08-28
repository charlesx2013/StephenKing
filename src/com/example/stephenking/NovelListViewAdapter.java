package com.example.stephenking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NovelListViewAdapter extends ArrayAdapter<Novel>{
	private final Context context;
	private final Novel[] novels;
	
	static class RowView {
		TextView title;
		TextView pubYear;
		ImageView image;
	}

	public NovelListViewAdapter(Context context, Novel[] novels) {
	  super(context, R.layout.activity_novel_list_item, novels);
	  this.context = context;
	  this.novels = novels;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		
	  View rowView = convertView;
	  
	  if (rowView == null) {
	  	LayoutInflater inflater = (LayoutInflater) context
		            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    rowView = inflater.inflate(R.layout.activity_novel_list_item, null);
	    RowView viewHolder = new RowView();
	    viewHolder.title = (TextView) rowView.findViewById(R.id.novel_title);
	    viewHolder.pubYear = (TextView) rowView.findViewById(R.id.publishing_year);
	    viewHolder.image = (ImageView) rowView.findViewById(R.id.book_image);
	    
	    rowView.setTag(viewHolder);
	  }

	  RowView row = (RowView) rowView.getTag();
	  Novel novel = novels[position];
	  
	  row.title.setText(novel.book_title);
	  row.pubYear.setText(novel.published_year);
	  row.image.setImageResource(novel.book_image);
	  
	  return rowView;				
	}
}
