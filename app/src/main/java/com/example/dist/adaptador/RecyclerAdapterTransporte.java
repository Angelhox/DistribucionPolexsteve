package com.example.dist.adaptador;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dist.R;
import com.example.dist.model.ItemList;
import com.example.dist.model.ItemListTransporte;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RecyclerAdapterTransporte extends RecyclerView.Adapter<RecyclerAdapterTransporte.RecyclerHolder> {
    private List<ItemListTransporte> items;
    private List<ItemListTransporte> originalItems;
    private RecyclerItemClick itemClick;;
    private String doamin_image = "http://192.168.100.55/distribResources/drawableTransporte/";

    public RecyclerAdapterTransporte(List<ItemListTransporte> items, RecyclerItemClick itemClick) {
        this.items = items;
        this.itemClick = itemClick;

        this.originalItems = new ArrayList<>();
        try {
            originalItems.addAll(items);
        }catch(Exception e){

        }
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view_transporte, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final ItemListTransporte item = items.get(position);
        //holder.imgItem.setImageResource(item.getImgResource());
        Picasso.get()
                .load(doamin_image+item.getImgResource())
                .into(holder.imgItem);
        holder.tvTipo.setText(item.getTipoVehiculo());
        holder.tvPlaca.setText(item.getPlaca());
        holder.tvAdquisicion.setText(item.getFechaAdquisicion());
        /*holder.tvPeso.setText(item.getPeso());
        holder.tvPrecio.setText(item.getProdPrecio());
        holder.tvPrecioVenta.setText(item.getPrecioVenta());*/


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.itemClick(item);
            }
        });

        /*holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("itemDetail", item);
                holder.itemView.getContext().startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        try {
            return items.size();
        }catch(Exception e){

        }
        return 0;
    }

    public void filter(final String strSearch) {
        if (strSearch.length()==0) {
            items.clear();
            items.addAll(originalItems);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                try{


                    items.clear();
                    List<ItemListTransporte> collect = originalItems.stream()
                            .filter(i -> i.getTipoVehiculo().toLowerCase().contains(strSearch))
                            .collect(Collectors.toList());

                    items.addAll(collect);}
                catch(Exception e ){

                }
            }
            else {
                items.clear();
                for (ItemListTransporte i : originalItems) {
                    if (i.getPlaca().toLowerCase().contains(strSearch)) {
                        items.add(i);
                    }
                }
            }

        }
        notifyDataSetChanged();
    }



    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView tvTipo;
        private TextView tvPlaca;
        private TextView tvAdquisicion;
        //private TextView tvPeso;
        // private TextView tvPrecio;
        //private TextView tvPrecioVenta;
        //private MultiAutoCompleteTextView tvDetalles;

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);

            imgItem = itemView.findViewById(R.id.imgItem);
            tvTipo = itemView.findViewById(R.id.tvTipo);
            tvPlaca = itemView.findViewById(R.id.tvPlaca);
            tvAdquisicion=itemView.findViewById(R.id.tvAdquisicion);
            //tvPeso=itemView.findViewById(R.id.tvPeso);
            //tvPrecio=itemView.findViewById(R.id.tvPrecio);
            //tvPrecioVenta=itemView.findViewById(R.id.tvPrecioVenta);
            // tvDetalles=itemView.findViewById(R.id.);

        }
    }

    public interface RecyclerItemClick {
        void itemClick(ItemListTransporte item);
    }
}

