package com.example.pokeappi.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PokeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pokemonEntity: PokemonCacheEntity): Long
    @Query("select * from pokemon")
    suspend fun get(): List<PokemonCacheEntity>
}