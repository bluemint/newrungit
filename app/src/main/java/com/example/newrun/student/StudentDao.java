package com.example.newrun.com.example.student;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2017/5/2.
 */

public class StudentDao {

    Context context;
    DbHelper dbHelper;
    public StudentDao(Context context) {
        this.context = context;
        dbHelper=new DbHelper(context,"student.db",null,1);
    }

    public  void insert(String num,String name){
        SQLiteDatabase sqLiteDatabase= dbHelper.getWritableDatabase();
        String sql="insert into student(num,name)values(?,?)";
        sqLiteDatabase.execSQL(sql,new String[]{num,name});

    }

    public Cursor query(String num, String name){
        SQLiteDatabase sqLiteDatabase= dbHelper.getReadableDatabase();
        String sql="select*from student where num=?and name=?";
        return sqLiteDatabase.rawQuery(sql,new String[]{num,name});


}
}
