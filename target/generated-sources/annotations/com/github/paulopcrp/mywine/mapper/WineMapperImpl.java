package com.github.paulopcrp.mywine.mapper;

import com.github.paulopcrp.mywine.dto.WineDTO;
import com.github.paulopcrp.mywine.entity.Wine;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-06T19:17:36-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
public class WineMapperImpl implements WineMapper {

    @Override
    public Wine toModel(WineDTO wineDTO) {
        if ( wineDTO == null ) {
            return null;
        }

        Wine wine = new Wine();

        wine.setId( wineDTO.getId() );
        wine.setName( wineDTO.getName() );
        wine.setBrand( wineDTO.getBrand() );
        if ( wineDTO.getMax() != null ) {
            wine.setMax( wineDTO.getMax() );
        }
        if ( wineDTO.getQuantity() != null ) {
            wine.setQuantity( wineDTO.getQuantity() );
        }
        wine.setType( wineDTO.getType() );

        return wine;
    }

    @Override
    public WineDTO toDTO(Wine wine) {
        if ( wine == null ) {
            return null;
        }

        WineDTO wineDTO = new WineDTO();

        wineDTO.setId( wine.getId() );
        wineDTO.setName( wine.getName() );
        wineDTO.setBrand( wine.getBrand() );
        wineDTO.setMax( wine.getMax() );
        wineDTO.setQuantity( wine.getQuantity() );
        wineDTO.setType( wine.getType() );

        return wineDTO;
    }
}
