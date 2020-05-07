package com.example.nba;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NBAApi {



    @GET("/10s/prod/v1/2016/players.json")
    Call<RestNBA> getNBAResponse();

}
