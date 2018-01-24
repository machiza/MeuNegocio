package mz.co.malambe.meunegocio;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by secreto on 1/24/18.
 */

public class ListAdapterRelatorio extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_relatorio,parent,false);

        return new ListAdapterRelatorio.ListeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListAdapterRelatorio.ListeViewHolder)holder).bindView(position);

    }

    @Override
    public int getItemCount() {
        return OurData.utilizador.length;
    }
    private class ListeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtEntradas, txtSaidas;
        public ListeViewHolder(View itemView){
            super(itemView);
            txtEntradas = (TextView)itemView.findViewById(R.id.txtEntradas);
            txtSaidas = (TextView)itemView.findViewById(R.id.txtSaldoSaidas);
            itemView.setOnClickListener(this);

        }
        public void bindView(int position) {
            txtEntradas.setText(OurData.entrada[position]+"");
            txtSaidas.setText(OurData.saida[position]+"");
        }

        int conta = 0;

        @Override
        public void onClick(View v) {
//            conta += 1;
//            int pos = this.getAdapterPosition();
//            OurData.quantCompra[pos] += 1;
//            quantCompra.setText(conta+"");
        }
    }
}
