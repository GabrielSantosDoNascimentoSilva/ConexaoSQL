package com.example.adm.testes3;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtUsuario,edtSenha;
    private Button btnSalvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnSalvar = (Button) findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtUsuario.getText().toString().equals("gabriel") && edtSenha.getText().toString().equals("123")){
                    Intent it = new Intent(MainActivity.this,DashBoard.class);
                    startActivity(it);
                }else{
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setMessage("Usuario invalido");
                    dlg.setNeutralButton("OK",null);
                    dlg.show();
                    edtUsuario.setText("");
                    edtSenha.setText("");
                }
            }
        });

    }
}
