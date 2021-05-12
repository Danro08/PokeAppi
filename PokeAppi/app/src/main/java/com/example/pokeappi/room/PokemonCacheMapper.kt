package com.example.pokeappi.room

import com.example.pokeappi.model.Pokemon
import com.example.pokeappi.retrofit.PokemonNetworkEntity
import com.example.pokeappi.utils.EntityMapper
import javax.inject.Inject

class PokemonCacheMapper
@Inject
constructor():
    EntityMapper<PokemonCacheEntity, Pokemon> {
    override fun mapFromEntity(entity: PokemonCacheEntity): Pokemon {
        return Pokemon(
            id = entity.id,
            name = entity.name,
            base_experience = entity.base_experience,
            height = entity.height,
            weight = entity.weight,
        )
    }

    override fun mapToEntity(domainModel: Pokemon): PokemonCacheEntity {
        return PokemonCacheEntity(
            id = domainModel.id,
            name = domainModel.name,
            base_experience = domainModel.base_experience,
            height = domainModel.height,
            weight = domainModel.weight,
        )
    }

    fun mapFromEntityList(entities: List<PokemonCacheEntity>): List<Pokemon>{
        return entities.map { mapFromEntity(it) }
    }
}