package main.java.edu.gatech;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RegisterAccountActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_account);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register_account, menu);
		return true;
	}

}
