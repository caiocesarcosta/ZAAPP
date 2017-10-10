package br.com.costa.cesar.caio.zaapp.view.model;

/**
 * Created by cesar on 18/09/17.
 */

public class Enderecos {


    private String Logradouro;
    private String Numero;
    private String complemento;
    private String CEP;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Zona;

    public Enderecos() {

    }

    public Enderecos(String logradouro, String numero, String complemento, String CEP, String bairro, String cidade, String estado, String zona) {

        this.Logradouro = logradouro;
        this.Numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.Bairro = bairro;
        this.Cidade = cidade;
        this.Estado = estado;
        this.Zona = zona;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        Zona = zona;
    }
}
