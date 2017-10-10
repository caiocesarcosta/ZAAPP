package br.com.costa.cesar.caio.zaapp.view;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.costa.cesar.caio.zaapp.R;
import br.com.costa.cesar.caio.zaapp.view.model.Imovel;
import br.com.costa.cesar.caio.zaapp.view.model.ListaItemImovel;
import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by cesar on 15/09/17.
 */

public class AdapterImovelPersonalizado extends BaseAdapter {

    private final ListaItemImovel modImovel;
    private final Activity act;

    public AdapterImovelPersonalizado(ListaItemImovel modImovel, Activity act) {
        this.modImovel = modImovel;
        this.act = act;
    }

    @Override
    public int getCount() {


        return modImovel.listaItem.size();
    }

    @Override
    public Object getItem(int i) {

        return modImovel.listaItem.get(i);
    }

    @Override
    public long getItemId(int i) {

        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewAdater = act.getLayoutInflater()
                .inflate(R.layout.item_descricao_imovel, viewGroup, false);
//        imageView
//        ImageView imgAdapter = (ImageView)view.findViewById(R.id.lista_curso_personalizada_imagem);

        //txtTipoImovel
        TextView txtTipoImovelAdapter = (TextView) view.findViewById(R.id.txtTipoImovel);

        //imgUrl
        ImageView imgUrlAdapter = (ImageView) view.findViewById(R.id.imgUrl);

        //txtSuites
        TextView txtSuitesAdapter = (TextView) view.findViewById(R.id.txtSuites);

        //txtQuartos
        TextView txtQuartosAdapter = (TextView) view.findViewById(R.id.txtQuartos);

        //txtVagas
        TextView txtVagasAdapter = (TextView) view.findViewById(R.id.txtVagas);

        //txtArea
        TextView txtAreaAdapter = (TextView) view.findViewById(R.id.txtArea);

        //txtBairro
        TextView txtBairroAdapter = (TextView) view.findViewById(R.id.txtBairro);

        //txtZona
        TextView txtZonaAdapter = (TextView) view.findViewById(R.id.txtZona);
        //txtPreco
        TextView txtPrecoAdapter = (TextView) view.findViewById(R.id.txtPreco);

        //txtRua
        TextView txtRuaAdapter = (TextView) view.findViewById(R.id.txtRua);

        //txtNumero
        TextView txtNumeroAdapter = (TextView) view.findViewById(R.id.txtNumero);

        //txtCep
        TextView txtCepAdapter = (TextView) view.findViewById(R.id.txtCep);

        //txtCidade
        TextView txtCidadeAdapter = (TextView) view.findViewById(R.id.txtCidade);

        //txtEstado
        TextView txtEstadoAdapter = (TextView) view.findViewById(R.id.txtEstado);

        //btnContatar
        Button btnContatarAdapter = (Button) view.findViewById(R.id.btnContatar);

        return viewAdater;
    }


}
