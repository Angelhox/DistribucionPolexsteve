package com.example.dist.retrofitdata;

import com.example.dist.model.ItemList;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {
    @GET("distribResources/archives/getItemsProductos.php")

    Call<List<ItemList>> getItemsDB();
}
