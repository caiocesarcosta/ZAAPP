package br.com.costa.cesar.caio.zaapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import br.com.costa.cesar.caio.zaapp.R;
import br.com.costa.cesar.caio.zaapp.view.Control.SolicitacaoDadosWebService;
import br.com.costa.cesar.caio.zaapp.view.model.*;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SolicitacaoDadosWebService openService = new SolicitacaoDadosWebService();

         ListaItemImovel listaImovel= new ListaItemImovel() ;


        try {
            listaImovel =  openService.buscaTodosDadosImoveisJSON();
        } catch (IOException e) {
            e.printStackTrace();
        }





        ListView listaDeImovel = (ListView) findViewById(R.id.lvLIstaImovel);

        //AdapterImovelPersonalizado adImovel = new AdapterImovelPersonalizado(listaImovel,this);

//        listaDeImovel.setAdapter(adImovel);


    }
}
