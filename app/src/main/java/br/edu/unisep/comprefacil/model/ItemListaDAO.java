package br.edu.unisep.comprefacil.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.edu.unisep.comprefacil.vo.ItemListaVO;
import br.edu.unisep.comprefacil.vo.ListaVO;

/**
 * Created by junio_000 on 18/06/2015.
 */
public class ItemListaDAO {

    private ListaHelper helper;

    public ItemListaDAO(Context ctx) {
        this.helper = new ListaHelper(ctx, "lista", null,1);
    }

    public void salvar(ItemListaVO item){
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put("nome", item.getNome());

        db.insert("itemLista", null, valores);
        db.close();
    }

    public List<String> listar() {

        List<String> lista = new ArrayList<String>();

        String selectQuery = "SELECT  * FROM itemLista";
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor cursor = db.rawQuery(selectQuery, null);
        if (cursor.moveToFirst()) {
            do {
                lista.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // closing connection
        cursor.close();
        db.close();

        // returning lables
        return lista;

    }
}
