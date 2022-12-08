package com.lastcivilization.equipmentreadservice.infrastructure.application.rest;

import com.lastcivilization.equipmentreadservice.domain.EquipmentService;
import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;
import com.lastcivilization.equipmentreadservice.infrastructure.application.rest.dto.EquipmentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;

import static com.lastcivilization.equipmentreadservice.infrastructure.application.rest.RestMapper.MAPPER;

@RestController
@RequiredArgsConstructor
@RequestMapping("/equipments")
@Validated
public class EquipmentController {

    private final EquipmentService equipmentService;

    @GetMapping("/{id}")
    EquipmentDto getEquipmentDto(@PathVariable @Min(1) long id) {
        EquipmentModel equipmentModel = equipmentService.getEquipmentById(id);
        return MAPPER.toDto(equipmentModel);
    }
}

