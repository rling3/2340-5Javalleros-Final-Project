package main.java.edu.gatech;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBHandler {
	
	private DBHelper helper;
	private SQLiteDatabase database;
	private static final String TABLENAME = "Users";
	
	
	public DBHandler(Context context){
		helper = new DBHelper(context);
		database = helper.getWritableDatabase();
	}
	
	public long createUser(String email, String password){
		Log.d("createUser", "Entering createUser()");
		ContentValues values = new ContentValues();
		values.put("Email", email);
		values.put("Password", password);
		Log.d("createUser", "Creating: " + email + " and " + password);
		long temp = database.insert(TABLENAME, null, values);
		return temp;
	}
	
	public Cursor selectUser(String email, String password){
		Log.d("selectUser", "Entering selectUser()");
		//String[] cols = new String[] {"Email", "Password"};
		String[] vals = new String[] {email, password}; 
		Cursor myCursor = database.rawQuery("select * from Users where Email=? and Password=?" ,new String [] {email, password});
		if (myCursor != null) {
			Log.d("selectUser", "myCursor != null");
		}
		return myCursor;
	}
	
}

