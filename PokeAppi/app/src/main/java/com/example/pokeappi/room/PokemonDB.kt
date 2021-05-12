package com.example.pokeappi.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [PokemonCacheEntity::class], version = 1)
abstract class PokemonDB : RoomDatabase() {
    companion object{
        val DATABASE_NAME = "PokemonDB"
    }
    abstract fun pokeDao(): PokeDao
}