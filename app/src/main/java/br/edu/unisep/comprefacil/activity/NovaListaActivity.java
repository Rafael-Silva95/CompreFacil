package br.edu.unisep.comprefacil.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.unisep.comprefacil.R;
import br.edu.unisep.comprefacil.model.ListaDAO;
import br.edu.unisep.comprefacil.vo.ListaVO;

public class NovaListaActivity extends Activity {

    private ListView listaView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        initList();
        listaView = (ListView) findViewById(R.id.lista);

        arrayAdapter = new ArrayAdapter(this, R.layout.simplerow, R.id.rowTextView, lista);
        listaView.setAdapter(arrayAdapter);
    }

    List<String> lista = new ArrayList<String>();

    private void initList() {
//        lista.add("Teste 1 ");
//        lista.add("Teste 2 ");
//        lista.add("Teste 3 ");
//        lista.add("Teste 4 ");
//        lista.add("Teste 5 ");

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


    public void atualizarLista() {
        listaView = (ListView) findViewById(R.id.lista);

        ListaDAO db = new ListaDAO(this);

        List<String> listaVOs = db.listar();


        arrayAdapter = new ArrayAdapter(this, R.layout.simplerow, R.id.rowTextView, listaVOs);
        listaView.setAdapter(arrayAdapter);
    }

    public void novaLista(View view) {
        EditText txtCriarLista = (EditText) findViewById(R.id.txtCriarLista);

        lista.add(txtCriarLista.getText().toString());

        ListaVO listaVO = new ListaVO();

        for (String listaString : lista) {
            listaVO.setNome(listaString);
        }

        ListaDAO db = new ListaDAO(this);
        db.salvar(listaVO);


        atualizarLista();
        System.out.println(lista);
    }
}
