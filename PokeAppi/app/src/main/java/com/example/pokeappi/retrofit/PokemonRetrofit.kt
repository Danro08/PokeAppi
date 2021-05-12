package com.example.pokeappi.retrofit

import retrofit2.http.GET

interface PokemonRetrofit {
    @GET("pokemon/?limit=100")
    suspend fun get_pokemons(): List<PokemonNetworkEntity>
}