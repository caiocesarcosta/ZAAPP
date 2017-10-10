package br.com.costa.cesar.caio.zaapp.view.webservice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import br.com.costa.cesar.caio.zaapp.view.model.Imovel;
import br.com.costa.cesar.caio.zaapp.view.model.ImovelDeserializa;
import br.com.costa.cesar.caio.zaapp.view.model.Imovel_Lista_itens_Des;
import br.com.costa.cesar.caio.zaapp.view.model.ItemImovel;
import br.com.costa.cesar.caio.zaapp.view.model.ListaItemImovel;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by cesar on 13/09/17.
 */

public class ServiceGenerator {

    //URL base do endpoint. Deve sempre terminar com /
    public static final String API_BASE_URL_IMOVEIS = "http://demo4573903.mockable.io/";
//    public static final String API_BASE_URL_IMOVEIS = "https://jsonplaceholder.typicode.com/";

    public static RetrofitService createService(Class<RetrofitService> serviceClass) {

        //Instancia do interceptador das requisições
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();

        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder().readTimeout(999, TimeUnit.SECONDS);

        httpClient.addInterceptor(loggingInterceptor);


        Gson g = new GsonBuilder().registerTypeAdapter(ListaItemImovel.class, new Imovel_Lista_itens_Des()).create();

        //Instância do retrofit
        Retrofit retrofit = new Retrofit.Builder()
                                        .baseUrl(API_BASE_URL_IMOVEIS)
                                        .addConverterFactory(GsonConverterFactory.create(g))
                                        .client(httpClient.build())
                                        .build();

        return retrofit.create(serviceClass);





    }
}
