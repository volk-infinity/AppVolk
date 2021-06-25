package com.example.appvolk.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ConsultorDAO extends SQLiteOpenHelper {

    private final String TABLE_CONSULTOR = "TB_CONSULTOR";

    public ConsultorDAO(@Nullable Context context) {
        super(context, "DB_VOLK", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_CONSULTOR + " (" +
                "COD_CONSULTOR INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NOME_CONSULTOR VARCHAR(100)," +
                "COD_CARGO INTEGER," +
                "USUARIO_CONSULTOR VARCHAR(10)," +
                "SENHA_CONSULTOR VARCHAR(8)," +
                "FOREIGN KEY(COD_CARGO) REFERENCES TB_CARGO(COD_CARGO)" +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public Long insert(ConsultorDTO consultorDTO) {
        ContentValues values = new ContentValues();

        values.put("NOME_CONSULTOR", consultorDTO.getNome());
        values.put("COD_CARGO", consultorDTO.getCargoId());
        values.put("USUARIO_CONSULTOR", consultorDTO.getUsuario());
        values.put("SENHA_CONSULTOR", consultorDTO.getSenha());

        long numLines = getWritableDatabase().insert(TABLE_CONSULTOR, null, values);
        return numLines;
    }

    public ArrayList<ConsultorDTO> select() {
        String query = "SELECT * FROM " + TABLE_CONSULTOR;
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        ArrayList<ConsultorDTO> lista = new ArrayList<>();

        while(cursor.moveToNext()) {
            ConsultorDTO consultorDTO = new ConsultorDTO();

            consultorDTO.setId(cursor.getInt(0));
            consultorDTO.setNome(cursor.getString(1));
            consultorDTO.setCargo(cursor.getInt(2));
            consultorDTO.setUsuario(cursor.getString(3));
            consultorDTO.setSenha(cursor.getString(4));

            lista.add(consultorDTO);
        }

        return lista;
    }
}
