package com.laioffer.tinnews.network;

import com.laioffer.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {
    //EX: GET https://newsapi.org/v2/top-headlines?country=us&apiKey=0ea187d46a364663b1b36fc980680abb
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);



    //EX: GET https://newsapi.org/v2/everything?q=bitcoin&apiKey=0ea187d46a364663b1b36fc980680abb
    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);

}
