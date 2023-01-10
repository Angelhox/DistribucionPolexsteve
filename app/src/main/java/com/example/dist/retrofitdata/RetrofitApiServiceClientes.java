package com.example.dist.retrofitdata;


import com.example.dist.model.ItemListClientes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiServiceClientes {
    @GET("distribResources/archives/getItemsClientes.php")

    Call<List<ItemListClientes>> getItemsDB();
}
