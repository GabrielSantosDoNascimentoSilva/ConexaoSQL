package com.example.adm.testes3;


import android.app.Activity;
import android.app.AlertDialog;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;


public class DashBoard extends Activity{
    private DataBase dataBase;
    private SQLiteDatabase conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        try {
            dataBase = new DataBase(this);
            conn = dataBase.getWritableDatabase();

            AlertDialog.Builder dlg = new AlertDialog.Builder(DashBoard.this);
            dlg.setMessage("Conexão criada com sucesso");
            dlg.setNeutralButton("Certo",null);
            dlg.show();
        }catch(SQLException e){
            AlertDialog.Builder dlg = new AlertDialog.Builder(DashBoard.this);
            dlg.setMessage("Erro ao Criar o Banco:" + e.getMessage());
            dlg.setNeutralButton("OK",null);
            dlg.show();
        }
    }
}
