package com.example.dist.retrofitdata;

import com.example.dist.model.ItemListTransporte;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiServiceTransporte {
    @GET("distribResources/archives/getItemsTransportes.php")

    Call<List<ItemListTransporte>> getItemsDB();
}
