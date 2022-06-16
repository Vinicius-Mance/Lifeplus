package br.com.lifeplus

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

data class FoodAPI(

    @SerializedName("data") val data : List<Array<JsonAdapter>>

)
