package com.lastcivilization.equipmentreadservice.infrastructure.database;


import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface EntityMapper {

    EntityMapper MAPPER = Mappers.getMapper(EntityMapper.class);

    EquipmentModel toDomain(EquipmentEntity equipmentEntity);
    EquipmentEntity toEntity(EquipmentModel equipmentModel);
}
