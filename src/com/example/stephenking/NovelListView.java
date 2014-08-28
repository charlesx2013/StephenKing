package com.example.stephenking;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


public class NovelListView extends ListActivity {
	
	
	public String[] titles = {"Carrie", "Green Mile", "It", "The Shining", "Carrie", "Green Mile", "It", "The Shining", "Carrie", "Green Mile", "It", "The Shining", "Carrie", "Green Mile", "It", "The Shining"};
	public String[] pub_years = { "Apr 1974", "Mar 1996", "Sept 1986","Apr 1997", "Apr 1974", "Mar 1996", "Sept 1986","Apr 1997", "Apr 1974", "Mar 1996", "Sept 1986","Apr 1997", "Apr 1974", "Mar 1996", "Sept 1986","Apr 1997" };
	public int[] book_pics = { R.drawable.carrie, R.drawable.green_mile,
							   R.drawable.it, R.drawable.the_shining,  
							   R.drawable.carrie, R.drawable.green_mile,
							   R.drawable.it, R.drawable.the_shining,
							   R.drawable.carrie, R.drawable.green_mile,
							   R.drawable.it, R.drawable.the_shining,
							   R.drawable.carrie, R.drawable.green_mile,
							   R.drawable.it, R.drawable.the_shining};
	public int books = 16;
	private Novel[] novels;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel_list_view);
        
        novels = new Novel[books];
        for (int i = 0; i < books; i++) {
        	novels[i] = new Novel(titles[i], pub_years[i], book_pics[i]);
        }
        
        NovelListViewAdapter adapter = new NovelListViewAdapter(this, novels);
        setListAdapter(adapter);
        
    }
    
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
      Novel novel = novels[position];
      Intent intent = new Intent(this, NovelListViewDetail.class);
      intent.putExtra("image_id", novel.book_image);
      startActivity(intent);
    }
}
