package com.example.appvolk.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CargoDAO extends SQLiteOpenHelper {

    private final String TABLE_CARGO = "TB_CARGO";

    public CargoDAO(@Nullable Context context) {
        super(context, "DB_VOLK", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createQuerry = "CREATE TABLE " + TABLE_CARGO + " (" +
                "COD_CARGO INTEGER PRIMARY KEY AUTOINCREMENT," +
                "DESC_CARGO VARCHAR(100)" +
                ");";
        db.execSQL(createQuerry);

        String insertQuery = "INSERT INTO " + TABLE_CARGO + " (DESC_CARGO) VALUES " +
                "('Desenvolvedor Backend')," +
                "('Desenvolvedor Mobile')," +
                "('Analista de Sistemas')," +
                "('Desenvolvedor Frontend')," +
                "('Administrador de Banco de Dados');";
        db.execSQL(insertQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public String select(int cargoId) {
        String query = "SELECT DESC_CARGO FROM TABLE_CARGO WHERE COD_CARGO = " + cargoId;
        Cursor cursor = getReadableDatabase().rawQuery(query, null);

        if(cursor.getCount() == 1) {
            cursor.moveToFirst();
            return cursor.getString(0);
        }
        return null;
    }
}
