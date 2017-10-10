package br.com.costa.cesar.caio.zaapp.view.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by cesar on 21/09/17.
 */

public class ListaItemImovel implements Serializable {

    private static final long serialVersionUID = 1L;

    public ArrayList<ItemImovel> listaItem ;

    public ListaItemImovel() {
//        this.listaItem = new ArrayList<ItemImovel>();

    }

    public ListaItemImovel(ArrayList<ItemImovel> listaItem)
    {
        this.listaItem = listaItem;
    }

    public ArrayList<ItemImovel> getListaItem()
    {
        return listaItem;
    }

    public void setListaItem(ArrayList<ItemImovel> listaItem)
    {
        this.listaItem = listaItem;
    }
}
