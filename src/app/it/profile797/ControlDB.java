package app.it.profile797;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ControlDB extends SQLiteOpenHelper{
	private static final String DATABASE_NAME = "Profile797";
	private static final String TABLE_NAME = "Myprofile" ;
	private static final int DATABASE_VERSION = 1 ;

	
	public ControlDB(Context context) {
		super(context,DATABASE_NAME,null,DATABASE_VERSION);
		
	}
 @Override
public void onCreate(SQLiteDatabase db) {
	 db.execSQL("CREATE TABLE "
			 +TABLE_NAME
			 +"(profile_ID INTEGER PRIMARY KEY AUTOINCREMENT,"
			 +"Name TEXT(20),"
			 +"Age INTEGER(5),"
			 +"Birthday DATE,"+"Height INTEGER(4),"+"Weight INTEGER(4),"+"Email TEXT(20));");
	 Log.d("CREATE TABLE", "Create Table successfully");
	
}		

	public long InsertData(String strName, String strAge, String strBirthday,
			String strHeight, String strWeight, String strEmail) {
try{
	SQLiteDatabase db;
	db = this.getWritableDatabase();
	ContentValues values = new ContentValues();
	values.put("Name", strName);
	values.put("Age", strAge);
	values.put("Birthday", strBirthday);
	values.put("Height", strHeight);
	values.put("Weight", strWeight);
	values.put("Email", strEmail);
	long l = db.insert(TABLE_NAME, null, values);
	db.close();
	return l;
}catch(Exception e){
		return -1;
}
	}
	
	 public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
		 db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
		 onCreate(db);
		
	}
}
