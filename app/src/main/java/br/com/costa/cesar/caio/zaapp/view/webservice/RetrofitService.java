package br.com.costa.cesar.caio.zaapp.view.webservice;

import java.util.List;

import br.com.costa.cesar.caio.zaapp.view.model.Imovel;
import br.com.costa.cesar.caio.zaapp.view.model.ListaItemImovel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;


/**
 * Created by cesar on 14/09/17.
 */

public interface RetrofitService {

//    @Headers("Content-Type: application/json")
    @GET("imoveis")
    Call<ListaItemImovel> selecTodosImoveis( );
}

/*
    @GET("imoveis/{id}")
  */


    //@Headers("X-Mashape-Key: AuuyclCPjcmshv2iOPq190OpzLrMp1FJWwejsnJrdfwOUr4h44")

//    @FormUrlEncoded
//    @POST("imoveis")


  /*

   Call<Imovel> Imovelconvert(  // @Field("strImoveis") String strImoveis,
                                    @Field("CodImovel") Integer intCodImovel,
                                    @Field("TipoImovel") String strTipoImovel,

                                 // @Field("strEndereco") String strEndereco,
                                    @Field("Numero") String intNumero,
                                    @Field("CEP") Integer intCEP,
                                    @Field("Bairro") String strBairro,
                                    @Field("Cidade") String strCidade,
                                    @Field("Estado") String strEstado,
                                    @Field("Zona") String strZona,

                                    @Field("PrecoVenda") Double dblPrecoVenda,
                                    @Field("Dormitorios") Integer intDormitorios,
                                    @Field("Suites") Integer intSuites,
                                    @Field("Vagas") Integer intVagas,
                                    @Field("AreaUtil") Integer intAreaUtil,
                                    @Field("AreaTotal") Integer intAreaTotal,
                                    @Field("DataAtualizacao") String strDataAtualizacao,

                                    //strCliente") String strCliente,
                                    @Field("CodCliente") Integer intCodCliente,
                                    @Field("NomeFantasia") String strNomeFantasia,
                                    @Field("SubTipoOferta") String strSubTipoOferta,
                                    @Field("SubSubtipoImovel") String strSubSubtipoImovel
                               );

*/


