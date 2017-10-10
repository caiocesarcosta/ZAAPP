package br.com.costa.cesar.caio.zaapp.view.model;


import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cesar on 14/09/17.
 */

public class Imovel implements Serializable {
    private static final long serialVersionUID = 1L;

    private int CodImovel;
    private String TipoImovel;
    private Enderecos Endereco;

    private String PrecoVenda;
    private int Dormitorios;
    private int Suites;
    private int Vagas;
    private int AreaUtil;
    private int AreaTotal;
    private String DataAtualizacao;


    private String strCliente;
    private String intCodCliente;
    private String strNomeFantasia;
    private Clientes Cliente;

//    private String UrlImagem;
    private ArrayList<Bitmap> urlImagem;
    private String SubTipoOferta;
    private String SubtipoImovel;


    public Imovel() {

    }


    public int getCodImovel() {
        return CodImovel;
    }

    public void setCodImovel(int codImovel) {
        CodImovel = codImovel;
    }

    public String getTipoImovel() {
        return TipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        TipoImovel = tipoImovel;
    }

    public Enderecos getEndereco() {
        return Endereco;
    }

    public void setEndereco(Enderecos endereco) {
        Endereco = endereco;
    }

    public String getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        PrecoVenda = precoVenda;
    }

    public int getDormitorios() {
        return Dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        Dormitorios = dormitorios;
    }

    public int getSuites() {
        return Suites;
    }

    public void setSuites(int suites) {
        Suites = suites;
    }

    public int getVagas() {
        return Vagas;
    }

    public void setVagas(int vagas) {
        Vagas = vagas;
    }

    public int getAreaUtil() {
        return AreaUtil;
    }

    public void setAreaUtil(int areaUtil) {
        AreaUtil = areaUtil;
    }

    public int getAreaTotal() {
        return AreaTotal;
    }

    public void setAreaTotal(int areaTotal) {
        AreaTotal = areaTotal;
    }

    public String getDataAtualizacao() {
        return DataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        DataAtualizacao = dataAtualizacao;
    }

    public String getStrCliente() {
        return strCliente;
    }

    public void setStrCliente(String strCliente) {
        this.strCliente = strCliente;
    }

    public String getIntCodCliente() {
        return intCodCliente;
    }

    public void setIntCodCliente(String intCodCliente) {
        this.intCodCliente = intCodCliente;
    }

    public String getStrNomeFantasia() {
        return strNomeFantasia;
    }

    public void setStrNomeFantasia(String strNomeFantasia) {
        this.strNomeFantasia = strNomeFantasia;
    }

    public Clientes getCliente() {
        return Cliente;
    }

    public void setCliente(Clientes cliente) {
        Cliente = cliente;
    }

    public ArrayList<Bitmap> getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(ArrayList<Bitmap> urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getSubTipoOferta() {
        return SubTipoOferta;
    }

    public void setSubTipoOferta(String subTipoOferta) {
        SubTipoOferta = subTipoOferta;
    }

    public String getSubtipoImovel() {
        return SubtipoImovel;
    }

    public void setSubtipoImovel(String subtipoImovel) {
        SubtipoImovel = subtipoImovel;
    }
}

