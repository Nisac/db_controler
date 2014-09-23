package app.lap.nisachon;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class dbcontroler_122 extends SQLiteOpenHelper{
	
	
	String Age, Height, Major, Birthday, Province, Phone,Facebook ;
	
	
	private static final String DATABASE_NAME = "db122";
	private static final String TABLE_REGISTER = "register";
	private static final int DATABASE_VERSION = 1;

	public dbcontroler_122(Context context) {
		super(context, TABLE_REGISTER, null,DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL("CREATE TABLE  " + TABLE_REGISTER
				+"(regidterId INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "Age INTEGER,"
				+"Height INTEGER,"
				+"Major TEXT(100),"
				+"Birthday TEXT(100),"
				+"Province TEXT(100),"
				+"Phone INTEGER,"
				+"Facebook TEXT(100));");
		Log.d("CREATE TABLE","Create Table Successfully");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS  "+TABLE_REGISTER );
		onCreate(db);
		
	}
	
	public long insertData(String Age,String Height,String Major
			,String Birthday,String Province,String Phone,String Facebook){
		try {
			SQLiteDatabase db;
			db=this.getWritableDatabase();
			ContentValues s = new ContentValues();
			
			s.put("Age",Age);
			s.put("height", Height);
			s.put("Major", Major);
			s.put("Birthday",Birthday);
			s.put("Province",Province);
			s.put("Phone",Phone);
			s.put("Facebook",Facebook);
			
			long k = db.insert(TABLE_REGISTER, null,s);
			db.close();
			return k ;
			
		} catch (Exception e) {
			// TODO: handle exception
			return -1 ;
		}
		
	}

}
