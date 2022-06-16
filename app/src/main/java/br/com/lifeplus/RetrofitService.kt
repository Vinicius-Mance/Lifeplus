package br.com.lifeplus

import com.google.gson.annotations.JsonAdapter
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("food")
    fun getFoodData () : Call<FoodAPI>

}