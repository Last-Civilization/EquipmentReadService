package com.lastcivilization.equipmentreadservice.infrastructure.application.rest;

import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;
import com.lastcivilization.equipmentreadservice.infrastructure.application.rest.dto.EquipmentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface RestMapper {

    RestMapper MAPPER = Mappers.getMapper(RestMapper.class);

    EquipmentDto toDto(EquipmentModel equipmentModel);

}
