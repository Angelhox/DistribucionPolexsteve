package com.example.dist;

import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.dist.adaptador.RecyclerAdapterTransporte;
import com.example.dist.databinding.FragmentFragmentTransportBinding;
import com.example.dist.databinding.FragmentHomeBinding;
import com.example.dist.model.ItemList;
import com.example.dist.model.ItemListTransporte;
import com.example.dist.retrofitdata.RetrofitApiServiceTransporte;
import com.example.dist.retrofitdata.RetrofitClientTransporte;
import com.example.dist.ui.home.HomeFragment;
import com.example.dist.FragmentTransportViewModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class fragmentTransport extends Fragment implements RecyclerAdapterTransporte.RecyclerItemClick, SearchView.OnQueryTextListener {

    private FragmentFragmentTransportBinding binding;
    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapterTransporte adapter;
    private List<ItemListTransporte> items;
    private RetrofitApiServiceTransporte retrofitApiServiceTransporte;
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FragmentTransportViewModel fragmentTransportViewModel =
                new ViewModelProvider(this).get(FragmentTransportViewModel.class);



        binding = FragmentFragmentTransportBinding.inflate(inflater, container, false);
        root = binding.getRoot();
        rvLista = root.findViewById(R.id.rvLista);
        svSearch = root.findViewById(R.id.svSearch);
        initValues();
        initListener();

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    private void initViews(){
        rvLista = root.findViewById(R.id.rvLista);
        svSearch = root.findViewById(R.id.svSearch);
    }

    private void initValues() {
        retrofitApiServiceTransporte = RetrofitClientTransporte.getApiService();

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rvLista.setLayoutManager(manager);

        getItemsSQL();
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    /*private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("Saga de Broly", "Ultima pelicula de DB, peleas epicas.", R.drawable.saga_broly));
        itemLists.add(new ItemList("Super sayayines 4", "La ultima transformacion de la saga no canon.", R.drawable.ssj4s));
        itemLists.add(new ItemList("Super Sayayiness Blues", "Goku y Vegeta, la transformacion de dioses.", R.drawable.ssj_blues));
        itemLists.add(new ItemList("Goku ultrainstinto", "Infaltablñe power-up a Goku.", R.drawable.ultrainsitinto));
        itemLists.add(new ItemList("Super Vegeta Blue x2", "Diferentes transformaciones de super Vegeta.", R.drawable.super_vegeta));
        itemLists.add(new ItemList("Vegeta sapbe", "Vegeta sapbe o no sapbe xD.", R.drawable.vegeta_blue));
        itemLists.add(new ItemList("Saga de Broly", "Ultima pelicula de DB, peleas epicas.", R.drawable.saga_broly));
        itemLists.add(new ItemList("Super sayayines 4", "La ultima transformacion de la saga no canon.", R.drawable.ssj4s));
        itemLists.add(new ItemList("Super Sayayiness Blues", "Goku y Vegeta, la transformacion de dioses.", R.drawable.ssj_blues));
        itemLists.add(new ItemList("Goku ultrainstinto", "Infaltablñe power-up a Goku.", R.drawable.ultrainsitinto));
        itemLists.add(new ItemList("Super Vegeta Blue x2", "Diferentes transformaciones de super Vegeta.", R.drawable.super_vegeta));
        itemLists.add(new ItemList("Vegeta sapbe", "Vegeta sapbe o no sapbe xD.", R.drawable.vegeta_blue));
        return itemLists;
    }*/

    private void getItemsSQL() {
        retrofitApiServiceTransporte.getItemsDB().enqueue(new Callback<List<ItemListTransporte>>() {

            @Override
            public void onResponse(Call<List<ItemListTransporte>> call, Response<List<ItemListTransporte>> response) {
                items = response.body();
                adapter = new RecyclerAdapterTransporte(items, fragmentTransport.this);
                rvLista.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<ItemListTransporte>> call, Throwable t) {
                Toast.makeText(getContext(), "Error: "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void itemClick(ItemListTransporte item) {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        //intent.putExtra("itemDetail", item);
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        //adapter.filter(newText);
        return false;
    }



}