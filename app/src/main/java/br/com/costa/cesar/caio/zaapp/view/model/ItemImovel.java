package br.com.costa.cesar.caio.zaapp.view.model;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by cesar on 21/09/17.
 */

public class ItemImovel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int CodImovel;
    private String TipoImovel;

/*

    private Enderecos Endereco;

    private String PrecoVenda;
    private int Dormitorios;
    private int Suites;
    private int Vagas;
    private int AreaUtil;
    private int AreaTotal;
    private String DataAtualizacao;

    private Clientes Cliente;

//    private String UrlImagem;
    private Bitmap urlImagem;

    private  int StatusQualidadeTotal;
    private String SubTipoOferta;
    private String SubtipoImovel;

*/


    public ItemImovel() {

    }
    public ItemImovel(int codImovel, String tipoImovel) {
        CodImovel = codImovel;
        TipoImovel = tipoImovel;
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



/*    public ItemImovel(int codImovel, String tipoImovel, Enderecos endereco, String precoVenda, int dormitorios, int suites, int vagas, int areaUtil, int areaTotal, String dataAtualizacao, Clientes cliente, Bitmap urlImagem, int statusQualidadeTotal, String subTipoOferta, String subtipoImovel) {
        CodImovel = codImovel;
        TipoImovel = tipoImovel;
        Endereco = endereco;
        PrecoVenda = precoVenda;
        Dormitorios = dormitorios;
        Suites = suites;
        Vagas = vagas;
        AreaUtil = areaUtil;
        AreaTotal = areaTotal;
        DataAtualizacao = dataAtualizacao;
        Cliente = cliente;
        this.urlImagem = urlImagem;
        StatusQualidadeTotal = statusQualidadeTotal;
        SubTipoOferta = subTipoOferta;
        SubtipoImovel = subtipoImovel;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Clientes getCliente() {
        return Cliente;
    }

    public void setCliente(Clientes cliente) {
        Cliente = cliente;
    }

    public Bitmap getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(Bitmap urlImagem) {
        this.urlImagem = urlImagem;
    }

    public int getStatusQualidadeTotal() {
        return StatusQualidadeTotal;
    }

    public void setStatusQualidadeTotal(int statusQualidadeTotal) {
        StatusQualidadeTotal = statusQualidadeTotal;
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
*/
}
