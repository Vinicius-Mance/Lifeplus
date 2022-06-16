package br.com.lifeplus

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    val url : String = "http://localhost:8080/"

    val retrofitFactory = Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build()

    fun retrofitService() : RetrofitService {
        return retrofitFactory.create(RetrofitService::class.java)
    }

}