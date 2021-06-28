package com.example.appvolk.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ClienteDAO extends SQLiteOpenHelper {
    private final String TABLE_CLIENTE = "TB_CLIENTE";

    public ClienteDAO(@Nullable Context context) {
        super(context, "DB_VOLK", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_CLIENTE + " (" +
                "CPF_CLI VARCHAR(20) PRIMARY KEY," +
                "NOME_CLI VARCHAR(50)," +
                "EMAIL_CLI VARCHAR(80)," +
                "TELEFONE_CLI VARCHAR(15)" +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public Long insert(ClienteDTO clienteDTO) {
        ContentValues values = new ContentValues();

        values.put("CPF_CLI", clienteDTO.getCPF());
        values.put("NOME_CLI", clienteDTO.getNome());
        values.put("EMAIL_CLI", clienteDTO.getEmail());
        values.put("TELEFONE_CLI", clienteDTO.getTelefone());

        long numLines = getWritableDatabase().insert(TABLE_CLIENTE, null, values);
        return numLines;
    }

    public ArrayList<ClienteDTO> select() {
        String query = "SELECT * FROM " + TABLE_CLIENTE;
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        ArrayList<ClienteDTO> list = new ArrayList<>();

        while(cursor.moveToNext()) {
            ClienteDTO userDTO = new ClienteDTO();

            userDTO.setCPF(cursor.getString(0));
            userDTO.setNome(cursor.getString(1));
            userDTO.setEmail(cursor.getString(2));
            userDTO.setTelefone(cursor.getString(3));

            list.add(userDTO);
        }
        return list;
    }

    public ArrayList<ClienteDTO> select(String id) {
        String query = "SELECT * FROM " + TABLE_CLIENTE + " WHERE ID = " + id;
        Cursor cursor = getReadableDatabase().rawQuery(query, null);
        ArrayList<ClienteDTO> list = new ArrayList<>();

        while(cursor.moveToNext()) {
            ClienteDTO userDTO = new ClienteDTO();

            userDTO.setCPF(cursor.getString(0));
            userDTO.setNome(cursor.getString(1));
            userDTO.setEmail(cursor.getString(2));
            userDTO.setTelefone(cursor.getString(3));

            list.add(userDTO);
        }
        return list;
    }

}
