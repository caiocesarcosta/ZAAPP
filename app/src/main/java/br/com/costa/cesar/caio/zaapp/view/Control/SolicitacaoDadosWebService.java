package br.com.costa.cesar.caio.zaapp.view.Control;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.costa.cesar.caio.zaapp.view.model.*;
import br.com.costa.cesar.caio.zaapp.view.model.ListaItemImovel;
import br.com.costa.cesar.caio.zaapp.view.webservice.RetrofitService;
import br.com.costa.cesar.caio.zaapp.view.webservice.ServiceGenerator;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by cesar on 15/09/17.
 */

public class SolicitacaoDadosWebService {


    private static final String TAG = "OBS" ;
    private static final String TAG2 = "OBS2";
    private static final String TAG3 = "OBS3";
    final RetrofitService service;
//    Response <ListaItemImovel> auxResponse = null;
    public  ListaItemImovel  auxList = new ListaItemImovel();

    public SolicitacaoDadosWebService() {

        this.service = ServiceGenerator.createService(RetrofitService.class);

    }


    public ListaItemImovel buscaTodosDadosImoveisJSON () throws IOException {


     final  Call<ListaItemImovel> imoveis = service.selecTodosImoveis();
//        Call<List<Imovel>> imoveis = service.selecTodosImoveis();

        imoveis.enqueue(new Callback<ListaItemImovel>() {


            @Override
            public void onResponse(Call<ListaItemImovel> call, Response<ListaItemImovel> response) {

                if (response.isSuccessful()) {

//                        auxList = response.body();

                        for (Integer i = 0; i < response.body().getListaItem().size(); i++) {

//                        auxList.Imoveis.add(i, response.body().Imoveis.get(i));


/*
                        ItemImovel itemImovel =  new ItemImovel(auxCodImovel, auxTipoImovel ,endereco,auxPrecoVenda,
                                auxDormitorios, auxSuites,auxVagas, auxAreaTotal,auxAreaTotal, data_formatada,
                                cliente, bitmap,auxStatusQualidadeTotal, auxSubTipoOferta, auxSubtipoImovel);
*/


/*
                        auxList.listaItem.add(new ItemImovel(response.body().listaItem.get(i).getCodImovel(),
                                response.body().listaItem.get(i).getTipoImovel(), response.body().listaItem.get(i).getEndereco(),
                                response.body().listaItem.get(i).getPrecoVenda(),response.body().listaItem.get(i).getDormitorios(),
                                response.body().listaItem.get(i).getSuites(), response.body().listaItem.get(i).getVagas(),
                                response.body().listaItem.get(i).getAreaTotal(),response.body().listaItem.get(i).getAreaUtil(),
                                response.body().listaItem.get(i).getDataAtualizacao(),response.body().listaItem.get(i).getCliente(),
                                response.body().listaItem.get(i).getUrlImagem(),response.body().listaItem.get(i).getStatusQualidadeTotal(),
                                response.body().listaItem.get(i).getSubTipoOferta(),response.body().listaItem.get(i).getSubtipoImovel()));
*/

//                            response.body().getItens().get(i).getCodImovel();

//                                                        response.body().getListaItem().get(i).getCodImovel();

                            Log.e("Codigo Imovel: "," " + response.body().getListaItem().get(i).getCodImovel());

             /*           auxList.listaItem.add(new ItemImovel(response.body().listaItem.get(i).getCodImovel(),
                                response.body().listaItem.get(i).getTipoImovel()));
*/
                        }
                    }
                    else {

//                      Toast.makeText(this, "Nenhum cliente encontrado com o id ", Toast.LENGTH_LONG).show();
                        Log.e(TAG, "Erro Na Requisicao:" + response.code());
                    }



            }

            @Override
            public void onFailure(Call<ListaItemImovel> call, Throwable t) {

                Log.e(TAG2,"Erro :" + t.getMessage());

            }


        });

        return  auxList;
//        return  null;
//
    }


}
