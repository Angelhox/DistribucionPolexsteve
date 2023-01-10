package com.example.dist.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dist.DetailActivity;
import com.example.dist.R;
import com.example.dist.actions.iComunicaFragments;
import com.example.dist.adaptador.RecyclerAdapter;
import com.example.dist.databinding.FragmentHomeBinding;
import com.example.dist.model.ItemList;
import com.example.dist.pageCatalogo;
import com.example.dist.retrofitdata.RetrofitApiService;
import com.example.dist.retrofitdata.RetrofitClient;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener {

    private FragmentHomeBinding binding;
    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    private RetrofitApiService retrofitApiService;
    private View root;
    private CircleImageView btnCarrito;
    iComunicaFragments interfaceFragments;
    View vista;
    Activity actividad;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);



        binding = FragmentHomeBinding.inflate(inflater, container, false);
       root = binding.getRoot();
        rvLista = root.findViewById(R.id.rvLista);
        svSearch = root.findViewById(R.id.svSearch);

        initValues();
        initListener();
        btnCarrito=root.findViewById(R.id.carrito);


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
        retrofitApiService = RetrofitClient.getApiService();

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
        retrofitApiService.getItemsDB().enqueue(new Callback<List<ItemList>>() {

            @Override
            public void onResponse(Call<List<ItemList>> call, Response<List<ItemList>> response) {
                items = response.body();
                adapter = new RecyclerAdapter(items, HomeFragment.this);
                rvLista.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<ItemList>> call, Throwable t) {
                Toast.makeText(getContext(), "Error: "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        intent.putExtra("itemDetail", item);
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