package com.github.paulopcrp.mywine.mapper;

import com.github.paulopcrp.mywine.dto.WineDTO;
import com.github.paulopcrp.mywine.entity.Wine;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WineMapper {

    WineMapper INSTANCE = Mappers.getMapper(WineMapper.class);
    Wine toModel(WineDTO wineDTO);
    WineDTO toDTO(Wine wine);
}
