package main.java.edu.gatech;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.util.Log;
import android.view.*;
import android.widget.*;

public class MainMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
        Button btn1 = (Button) findViewById(R.id.accountBut);
        btn1.setOnClickListener(new View.OnClickListener() {
        	public void onClick(View v) {
        		Log.i("clicks","You Clicked Login");
                Intent i=new Intent(
                       MainMenu.this,
                       RegisterAccountActivity.class);
                startActivity(i);
        	}
        });
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
