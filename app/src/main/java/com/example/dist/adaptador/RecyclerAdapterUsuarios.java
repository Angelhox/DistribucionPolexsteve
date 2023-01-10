package com.example.dist.adaptador;

import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dist.R;
import com.example.dist.DetailActivity;
import com.example.dist.model.ItemList;
import com.example.dist.model.ItemListUsuarios;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RecyclerAdapterUsuarios extends RecyclerView.Adapter<RecyclerAdapterUsuarios.RecyclerHolder> {
    private List<ItemListUsuarios> items;
    private List<ItemListUsuarios> originalItems;
    private RecyclerItemClick itemClick;;
    private String doamin_image = "http://192.168.100.55/distribResources/drawableUsuarios/";

    public RecyclerAdapterUsuarios(List<ItemListUsuarios> items, RecyclerItemClick itemClick) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view_usuarios, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final ItemListUsuarios item = items.get(position);
        //holder.imgItem.setImageResource(item.getImgResource());
        Picasso.get()
                .load(doamin_image+item.getImgResource())
                .into(holder.imgItem);
        holder.tvNombre.setText(item.getNombre());
        holder.tvCargo.setText(item.getUsuarioCargo());
        holder.tvCedula.setText(item.getCedulaRuc());
        holder.tvCorreo.setText(item.getUsuarioCorreo());
       // holder.tvPrecio.setText(item.getProdPrecio());
        //holder.tvPrecioVenta.setText(item.getPrecioVenta());


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
       try{ if (strSearch.length()==0||strSearch.isEmpty()) {
            items.clear();
            items.addAll(originalItems);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                try{


                    items.clear();
                    List<ItemListUsuarios> collect = originalItems.stream()
                            .filter(i -> i.getNombre().toLowerCase().contains(strSearch))
                            .collect(Collectors.toList());

                    items.addAll(collect);}
                catch(Exception e ){

                }
            }
            else {
                items.clear();
                for (ItemListUsuarios i : originalItems) {
                    if (i.getCedulaRuc().toLowerCase().contains(strSearch)) {
                        items.add(i);
                    }
                }
            }

        }
        notifyDataSetChanged();}catch(Exception e){

       }
    }



    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgItem;
        private TextView tvNombre;
        private TextView tvCargo;
        private TextView tvCedula;
        private TextView tvCorreo;
       /* private TextView tvPrecio;
        private TextView tvPrecioVenta;
        private MultiAutoCompleteTextView tvDetalles;*/

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);

            imgItem = itemView.findViewById(R.id.imgItem);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvCargo = itemView.findViewById(R.id.tvCargo);
            tvCedula=itemView.findViewById(R.id.tvCedula);
            tvCorreo=itemView.findViewById(R.id.tvCorreo);
           // tvPrecio=itemView.findViewById(R.id.tvPrecio);
            //tvPrecioVenta=itemView.findViewById(R.id.tvPrecioVenta);
            // tvDetalles=itemView.findViewById(R.id.);

        }
    }

    public interface RecyclerItemClick {
        void itemClick(ItemListUsuarios item);
    }
}

