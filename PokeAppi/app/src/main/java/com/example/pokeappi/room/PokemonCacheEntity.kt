package com.example.pokeappi.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "pokemon")
class PokemonCacheEntity(
        @PrimaryKey(autoGenerate = false)
        @ColumnInfo(name = "id")
        var id: Int,

        @ColumnInfo(name = "name")
        var name: String,

        @ColumnInfo(name = "base_experience")
        var base_experience: Int,

        @ColumnInfo(name = "height")
        var height: Int,

        @ColumnInfo(name = "weight")
        var weight: Int,
)