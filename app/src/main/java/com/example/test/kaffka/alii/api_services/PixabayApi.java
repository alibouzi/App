package com.example.test.kaffka.alii.api_services;

import com.example.test.kaffka.alii.models.PixabayImageList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PixabayApi {

    @GET("/api/")
    Call<PixabayImageList> getImageResults(@Query("key") String key, @Query("q") String query, @Query("page") int page, @Query("per_page") int perPage);
}
