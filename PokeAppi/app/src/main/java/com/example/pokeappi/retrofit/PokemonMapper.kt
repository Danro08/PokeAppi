package com.example.pokeappi.retrofit
import com.example.pokeappi.model.Pokemon
import com.example.pokeappi.utils.EntityMapper
import javax.inject.Inject

class PokemonMapper
@Inject
constructor():
    EntityMapper<PokemonNetworkEntity, Pokemon> {
    override fun mapFromEntity(entity: PokemonNetworkEntity): Pokemon {
        return Pokemon(
            id = entity.id,
            name = entity.name,
            base_experience = entity.base_experience,
            height = entity.height,
            weight = entity.weight,
        )
    }

    override fun mapToEntity(domainModel: Pokemon): PokemonNetworkEntity {
        return PokemonNetworkEntity(
            id = domainModel.id,
            name = domainModel.name,
            base_experience = domainModel.base_experience,
            height = domainModel.height,
            weight = domainModel.weight,
        )
    }

    fun mapFromEntityList(entities: List<PokemonNetworkEntity>): List<Pokemon>{
        return entities.map { mapFromEntity(it) }
    }
}