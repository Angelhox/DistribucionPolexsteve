package com.example.dist.retrofitdata;



import com.example.dist.model.ItemList;
import com.example.dist.model.ItemListUsuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiServiceUsuarios {
    @GET("distribResources/archives/getItemsUsuarios.php")

    Call<List<ItemListUsuarios>> getItemsDB();
}
