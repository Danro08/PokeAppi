package com.example.pokeappi.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PokemonNetworkEntity (
    @SerializedName("id")
    @Expose
    var id: Int,

    @SerializedName("name")
    @Expose
    var name: String,

    @SerializedName("base_experience")
    @Expose
    var base_experience: Int,

    @SerializedName("height")
    @Expose
    var height: Int,

    @SerializedName("weight")
    @Expose
    var weight: Int,
)