package com.example.adm.testes3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper{

    public DataBase(Context context) {
        super(context, "Produtos", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "Create table produtos(" +
                "_id integer not null primary key autoincrement, " +
                "produto text, " +
                "preco integer " +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
