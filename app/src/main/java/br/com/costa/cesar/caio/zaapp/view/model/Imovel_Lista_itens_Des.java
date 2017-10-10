package br.com.costa.cesar.caio.zaapp.view.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cesar on 21/09/17.
 */

public class Imovel_Lista_itens_Des implements JsonDeserializer {
    /**
     * Faz o dawnload da imagem aparir da sua url e retorna uma imagem Bitmap
     * @param url
     * @return Bitmap
     */
    private Bitmap baixarImagem(String url) {
        try{
            URL endereco;
            InputStream inputStream;
            Bitmap imagem;
            endereco = new URL(url);
            inputStream = endereco.openStream();
            imagem = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            return imagem;
        }catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Metodo que faz a desserializa o objeto
     * @param json
     * @param typeOfT
     * @param context
     * @return
     * @throws JsonParseException
     */

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {


        JsonArray array_imoveis = json.getAsJsonObject().get("Imoveis").getAsJsonArray();

//        ItemImovel itemImovel = new ItemImovel();


        ListaItemImovel lista_itens = new ListaItemImovel();
        ArrayList<ItemImovel> lista_imoveis = new  ArrayList<ItemImovel>();
        //Obtencao da data do Json
        Dominio ct = new Dominio();

        Enderecos endereco = new Enderecos();
        Clientes cliente = new Clientes();


        int auxCodImovel;
        String auxTipoImovel;
        JsonObject objetoJsonEndereco;
//        String preco_formatado;
        String auxPrecoVenda;
        JsonObject objetoJsonCliente;


        //variáveis para pegar a url e trgansformar em imagem
        String url_foto;
        Bitmap bitmap;

        int auxDormitorios;
        int  auxSuites;
        int auxVagas;
        int auxAreaUtil;
        int auxAreaTotal;
        int auxStatusQualidadeTotal;
        String auxSubTipoOferta;
        String auxSubtipoImovel;


        if (json.getAsJsonObject() != null){

            for (int i = 0; i<array_imoveis.size(); i++){
//            for (int i = 0; i<1; i++){

                auxCodImovel = array_imoveis.get(i).getAsJsonObject().get("CodImovel").getAsJsonPrimitive().getAsInt();
                auxTipoImovel = array_imoveis.get(i).getAsJsonObject().get("TipoImovel").toString().replace("\"", "");

/*                objetoJsonEndereco = json.getAsJsonObject().getAsJsonObject("Imoveis").get("Endereco").getAsJsonObject();

                //Obtensao do endereco
                endereco.setLogradouro(objetoJsonEndereco.get("Logradouro").toString().replace("\"", ""));
                endereco.setNumero(objetoJsonEndereco.get("Numero").toString().replace("\"", ""));
                endereco.setComplemento(objetoJsonEndereco.get("Complemento").toString().replace("\"", ""));
                endereco.setCEP(objetoJsonEndereco.get("CEP").toString().replace("\"", ""));
                endereco.setBairro(objetoJsonEndereco.get("Bairro").toString().replace("\"", ""));
                endereco.setCidade(objetoJsonEndereco.get("Cidade").toString().replace("\"", ""));
                endereco.setEstado(objetoJsonEndereco.get("Estado").toString().replace("\"", ""));
                endereco.setZona(objetoJsonEndereco.get("Zona").toString().replace("\"", ""));




                //no preco de venda chamamos o metodo formata_preco do controle para o deixar pronto pra exibicao
                auxPrecoVenda = ct.formata_preco(array_imoveis.get(i).getAsJsonObject().get("PrecoVenda").getAsJsonPrimitive().getAsInt());


                objetoJsonCliente = json.getAsJsonObject().getAsJsonObject("Imoveis").get("Cliente").getAsJsonObject();
                cliente.setCodCliente(objetoJsonCliente .get("CodCliente").getAsJsonPrimitive().getAsInt());
                cliente.setNomeFantasia(objetoJsonCliente .get("NomeFantasia").toString().replace("\"", ""));




                url_foto = array_imoveis.get(i).getAsJsonObject().get("rlImagem").toString().replace("\"", "");
                bitmap = baixarImagem(url_foto);




                auxDormitorios = array_imoveis.get(i).getAsJsonObject().get("Dormitorios").getAsJsonPrimitive().getAsInt();
                auxSuites = array_imoveis.get(i).getAsJsonObject().get("Suites").getAsJsonPrimitive().getAsInt();
                auxVagas = array_imoveis.get(i).getAsJsonObject().get("Vagas").getAsJsonPrimitive().getAsInt();
                auxAreaUtil = array_imoveis.get(i).getAsJsonObject().get("AreaUtil").getAsJsonPrimitive().getAsInt();
                auxAreaTotal = array_imoveis.get(i).getAsJsonObject().get("AreaTotal").getAsJsonPrimitive().getAsInt();

                //Obtencao da data do Json
                String data_json = array_imoveis.get(i).getAsJsonObject().get("DataAtualizacao").toString();
                String data_Long = data_json.replace("/", "").replace("Date", "").replace("(","").replace(")","").replace("\"","");
                //Formatacao da data
                Date date = new Date(Long.parseLong(data_Long));
                //data com dia, mes, ano, hora, minuto e segundo-> "dd:MM:yyyy - hh:mm:kk"
                DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                String data_formatada = dateFormat.format(date);


                auxStatusQualidadeTotal = array_imoveis.get(i).getAsJsonObject().get("StatusQualidadeTotal").getAsJsonPrimitive().getAsInt();

                auxSubTipoOferta = array_imoveis.get(i).getAsJsonObject().get("SubTipoOferta").toString().replace("\"", "");
                auxSubtipoImovel = array_imoveis.get(i).getAsJsonObject().get("SubtipoImovel").toString().replace("\"", "");
*/

/*

                ItemImovel itemImovel =  new ItemImovel(auxCodImovel, auxTipoImovel ,endereco,auxPrecoVenda,
                                             auxDormitorios, auxSuites,auxVagas, auxAreaTotal,auxAreaUtil ,data_formatada,
                                             cliente, bitmap,auxStatusQualidadeTotal, auxSubTipoOferta, auxSubtipoImovel);
*/

                ItemImovel itemImovel =  new ItemImovel(auxCodImovel, auxTipoImovel);
                lista_imoveis.add(itemImovel);

            }

            lista_itens.setListaItem(lista_imoveis);
            Log.d("Erro: ", "objeto não nulo: "+lista_imoveis.get(2).getCodImovel());
        }

        else {
            Log.d("Erro: ", "objeto null");
        }


        return lista_itens;
    }

}
