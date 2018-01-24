package mz.co.malambe.meunegocio;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards,parent,false);

        return new ListeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListeViewHolder)holder).bindView(position);

    }

    @Override
    public int getItemCount() {
        return OurData.nomeProduto.length;
    }
    private class ListeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView nomeProduto,qtdProduto,precoProduto,quantCompra;
        public ListeViewHolder(View itemView){
            super(itemView);
            nomeProduto = (TextView)itemView.findViewById(R.id.nomeProduto);
            qtdProduto = (TextView)itemView.findViewById(R.id.qtdProduto);
            precoProduto = (TextView)itemView.findViewById(R.id.precoProduto);
            quantCompra = (TextView)itemView.findViewById(R.id.quantCompra);
            itemView.setOnClickListener(this);

        }
        public void bindView(int position) {
            nomeProduto.setText(OurData.nomeProduto[position]);
            qtdProduto.setText(OurData.qtdProduto[position]);
            precoProduto.setText(OurData.precoProduto[position]);
        }

        int conta = 0;

        @Override
        public void onClick(View v) {
            conta += 1;
            int pos = this.getAdapterPosition();
            OurData.quantCompra[pos] += 1;
            quantCompra.setText(conta+"");
        }
    }

}
