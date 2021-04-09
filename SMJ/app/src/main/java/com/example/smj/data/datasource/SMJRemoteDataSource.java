package com.example.smj.data.datasource;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SMJRemoteDataSource {
    private static final String URL ="https://smj-server-heroku.herokuapp.com";
    private static Retrofit retrofit;

    public static Retrofit getInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
