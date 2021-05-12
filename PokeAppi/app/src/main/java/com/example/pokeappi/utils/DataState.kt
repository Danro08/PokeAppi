package com.example.pokeappi.utils

import com.example.pokeappi.model.Pokemon
import java.lang.Exception

sealed class DataState {
    object Idle: DataState()
    data class Success(val pokemons: List<Pokemon>) : DataState()
    data class Error(val exception: Exception) : DataState()
    object Loading: DataState()
}