package br.edu.unisep.comprefacil.vo;


import java.util.ArrayList;

public class ListaVO {

    private String nome;

    private ArrayList<ItemListaVO> item = new ArrayList<ItemListaVO>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ItemListaVO> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItemListaVO> item) {
        this.item = item;
    }
}
