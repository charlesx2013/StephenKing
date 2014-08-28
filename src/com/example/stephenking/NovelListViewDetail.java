package com.example.stephenking;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class NovelListViewDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novel_list_detail);
        ImageView novelImage = (ImageView) findViewById(R.id.book_detail_image);
        
        Bundle extras = getIntent().getExtras();
        int image = extras.getInt("image_id");
        
        novelImage.setImageResource(image);
        
        
    }
}
