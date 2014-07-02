package com.example.myfirstapp;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class NewActivity extends ListActivity {
	ListView lista;
	Button btn;
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new);
		 lista = (ListView) findViewById(android.R.id.list);
		 ArrayList<String> nume = new ArrayList<String>();
	        nume.add("Test1"); nume.add("Test2");
	        

	        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nume);
	        setListAdapter(adapter);
	        
	        lista.setOnItemClickListener(new OnItemClickListener() {

	            @Override
	            public void onItemClick(AdapterView<?> adaptor, View arg1, int position,
	                    long id) {
	                // TODO Auto-generated method stub
	                Toast.makeText(NewActivity.this, "Ai apasat-o pe "+ adaptor.getItemAtPosition(position), Toast.LENGTH_SHORT).show()    ;
	            }

	        }); 
	        btn = (Button)findViewById(R.id.button2);
	        btn.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	Toast.makeText(getApplicationContext(), "Button clicked!!!", Toast.LENGTH_LONG).show();
	            	//Intent intent = new Intent(MainActivity.this, NewActivity.class);
	            	//startActivity(intent);
	            
	            }
	        });
	}

}
