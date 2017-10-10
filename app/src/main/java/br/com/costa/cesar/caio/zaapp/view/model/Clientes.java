package br.com.costa.cesar.caio.zaapp.view.model;

/**
 * Created by cesar on 18/09/17.
 */

class Clientes {

    private int CodCliente;
    private String NomeFantasia;

    public Clientes() {
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(int codCliente) {
        CodCliente = codCliente;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        NomeFantasia = nomeFantasia;
    }
}
