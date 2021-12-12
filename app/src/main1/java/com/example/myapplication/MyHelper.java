package com.example.myapplication;
//纪权钊

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public MyHelper(Context context) {
        super(context, "itcast1.db", null, 2);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE information(_id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(20), price INTEGER)");
    }

    // 当数据库的版本号增加时调用
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}