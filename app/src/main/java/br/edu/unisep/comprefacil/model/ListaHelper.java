package br.edu.unisep.comprefacil.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by junio_000 on 18/06/2015.
 */
public class ListaHelper extends SQLiteOpenHelper {

    public ListaHelper(Context context, String name,
                       SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.createItemLista(db);
        this.createLista(db);
    }

    public void createItemLista(SQLiteDatabase db) {

        String sql = "create table itemLista (" +
                "_id integer primary key, " +
                "nome text, " +
                "quantidade integer " +
                ")";
        db.execSQL(sql);
    }

    public void createLista(SQLiteDatabase db) {

        String sql = "create table lista (" +
                "_id integer primary key, " +
                "nome text, " +
                "id_item INTEGER REFERENCES itemLista(_id) " +
                ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
