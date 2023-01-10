package com.example.dist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dist.R;
import com.example.dist.model.ItemList;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dist.model.ItemList;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgItemDetail;
    private TextView tvTituloDetail;
    private TextView tvDescripcionDetail;
    private TextView tvUnidadMedidaDetail;
    private TextView tvPesoDetail;
    private TextView tvPrecioDetail;
    private TextView tvPrecioVentaDetail;
    private TextView tvDetallesDetail;
    private CircleImageView btnCarrito;

    private String doamin_image = "http://1192.168.100.55/distribResources/drawableProductos/";
    private ItemList itemDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle(getClass().getSimpleName());

        initViews();
        initValues();
        btnCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailActivity.this, "añadir al Carrito", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initViews() {
        imgItemDetail = findViewById(R.id.imgItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
        tvUnidadMedidaDetail = findViewById(R.id.tvUnidadMedidaDetail);
        tvPesoDetail= findViewById(R.id.tvPesoDetail);
        tvPrecioDetail = findViewById(R.id.tvPrecioDetail);
        tvPrecioVentaDetail= findViewById(R.id.tvPrecioVentaDetail);
        tvDetallesDetail = findViewById(R.id.tvPrecioDetail);
        btnCarrito=findViewById(R.id.carrito);

    }

    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");

        //imgItemDetail.setImageResource(itemDetail.getImgResource());
        Picasso.get()
                .load(doamin_image+itemDetail.getImgResource())
                .into(imgItemDetail);
        tvTituloDetail.setText(itemDetail.getProdNombre());
        tvDescripcionDetail.setText(itemDetail.getPresentacion());
        tvUnidadMedidaDetail.setText(itemDetail.getUnidadMedida()+" X "+ Math.round(Double.parseDouble(itemDetail.getContenido())));
        tvPesoDetail.setText(itemDetail.getPeso());
        tvPrecioDetail.setText(itemDetail.getProdPrecio());
        tvPrecioVentaDetail.setText(itemDetail.getPrecioVenta());
        tvDetallesDetail.setText(itemDetail.getProdDetalles());

    }
}

