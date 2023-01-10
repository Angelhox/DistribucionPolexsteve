package com.example.dist.retrofitdata;

import com.example.dist.retrofitdata.RetrofitApiServiceUsuarios;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientClientes { private static Retrofit retrofit = null;
    public static final String URL_BASE = "http://192.168.100.55/";

    public static RetrofitApiServiceClientes getApiService() {
        if (retrofit == null) {
            retrofit = new  Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(RetrofitApiServiceClientes.class);
    }

}
