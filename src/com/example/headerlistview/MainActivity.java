package com.example.headerlistview;

import java.util.ArrayList; 

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.listView1);
        
        //com.example.headerlistview.GridView ff;
        
        com.example.headerlistview.HeaderGridView hg;
        hg= (com.example.headerlistview.HeaderGridView)findViewById(R.id.list);
        
      //  ff =(com.example.headerlistview.GridView)findViewById(R.id.list);  
        ArrayList<Model> models = new ArrayList<Model>();
	   // models.add(new Model("Group Title"));
	    models.add(new Model(R.drawable.ic_launcher,"Menu Item 1","1"));
	    models.add(new Model(R.drawable.ic_launcher,"Menu Item 2","2"));
	    models.add(new Model(R.drawable.ic_launcher,"Menu Item 3","12"));
     
	    MyAdapter adapter = new MyAdapter(this, models);
		
		// if extending Activity 2. Get ListView from activity_main.xml
		//ListView listView = (ListView) findViewById(R.id.listview);
		
		// 3. setListAdapter
		//listView.setAdapter(adapter); if extending Activity
	    
	    View header = View.inflate( this, R.layout.header, null);
	    hg.addHeaderView(header);
	    hg.setNumColumns(2);
	    hg.setAdapter(adapter);
	   // ff.setNumColumns(2);
	   // ff.addHeaderView(header);
	   // listView.addHeaderView(header);
	   
	    
	    
	 //   ff.setAdapter(adapter);
	  //  listView.setNumColumns(2);
		//listView.setAdapter(adapter); 
		//listView.setSelector(R.layout.listselector);
    }
}
