package com.example.pokeappi.repository

import com.example.pokeappi.retrofit.PokemonMapper
import com.example.pokeappi.retrofit.PokemonRetrofit
import com.example.pokeappi.room.PokeDao
import com.example.pokeappi.room.PokemonCacheMapper
import com.example.pokeappi.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PokemonRepository constructor(
    private val pokeDao: PokeDao,
    private val pokeRetrofit: PokemonRetrofit,
    private val cacheMapper: PokemonCacheMapper,
    private val networkMapper: PokemonMapper
){
    suspend fun getPokemons(): Flow<DataState> = flow {
        emit(DataState.Error(java.lang.Exception("error custom")))
        delay(5000)
        try {
            val pokeData = pokeRetrofit.get_pokemons()
            val pokeMap = networkMapper.mapFromEntityList(pokeData)
            for (tempPoke in pokeMap){
                pokeDao.insert(cacheMapper.mapToEntity(tempPoke))
            }
            val pokeCache = pokeDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(pokeCache)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}