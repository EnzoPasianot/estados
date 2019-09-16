package br.com.fatec.atividade02;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Estados extends Fragment {
    private View view;
    private ListView listView;
    private ImageView imageView;



    public Estados() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_estados, container, false);


        ListView listview = (ListView) view.findViewById(R.id.listview);

        String[] dados = new String[] {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, dados);

        imageView = (ImageView) view.findViewById(R.id.imageView);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        imageView.setImageResource(R.drawable.acre);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.alagoas);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.amapa);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.amazonas);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.bahia);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.ceara);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.distrito_federal);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.espirito_santo);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.goias);
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.mato_grosso);
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.mato_grosso_do_sul);
                        break;
                    case 11:
                        imageView.setImageResource(R.drawable.minas_gerais);
                        break;
                    case 12:
                        imageView.setImageResource(R.drawable.para);
                        break;
                    case 13:
                        imageView.setImageResource(R.drawable.paraiba);
                        break;
                    case 14:
                        imageView.setImageResource(R.drawable.parana);
                        break;
                    case 15:
                        imageView.setImageResource(R.drawable.pernambuco);
                        break;
                    case 16:
                        imageView.setImageResource(R.drawable.piaui);
                        break;
                    case 17:
                        imageView.setImageResource(R.drawable.rio_de_janeiro);
                        break;
                    case 18:
                        imageView.setImageResource(R.drawable.rio_grande_do_norte);
                        break;
                    case 19:
                        imageView.setImageResource(R.drawable.rio_grande_do_sul);
                        break;
                    case 20:
                        imageView.setImageResource(R.drawable.rondonia);
                        break;
                    case 21:
                        imageView.setImageResource(R.drawable.roraima);
                        break;
                    case 22:
                        imageView.setImageResource(R.drawable.santa_catarina);
                        break;
                    case 23:
                        imageView.setImageResource(R.drawable.sao_paulo);
                        break;
                    case 24:
                        imageView.setImageResource(R.drawable.saoluis);
                        break;
                    case 25:
                        imageView.setImageResource(R.drawable.sergipe);
                        break;
                    case 26:
                        imageView.setImageResource(R.drawable.tocantins);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.mato_grosso);
                        break;
                }
            }
        });

        listview.setAdapter(adapter);
        return view;
    }

}
