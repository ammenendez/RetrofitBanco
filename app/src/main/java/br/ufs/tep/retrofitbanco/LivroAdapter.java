package br.ufs.tep.retrofitbanco;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ammenendez on 28/09/16.
 */

public class LivroAdapter extends ArrayAdapter<Livro> {
    private final Context context;
    private final List<Livro> elementos;

    public LivroAdapter(Context context, List<Livro> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView titulo = (TextView) rowView.findViewById(R.id.txtNome);
        TextView ano = (TextView) rowView.findViewById(R.id.txtAno);
        TextView autor = (TextView) rowView.findViewById(R.id.txtAutor);

        titulo.setText(elementos.get(position).getNome());
        autor.setText(elementos.get(position).getAutor());
        ano.setText(Integer.toString(elementos.get(position).getAno()));

        return rowView;
    }
}
