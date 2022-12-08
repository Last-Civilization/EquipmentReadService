package com.lastcivilization.equipmentreadservice.domain;

import com.lastcivilization.equipmentreadservice.domain.exception.EquipmentNotFoundException;
import com.lastcivilization.equipmentreadservice.domain.port.EquipmentRepository;
import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;

public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public EquipmentModel getEquipmentById(long id) {
        EquipmentModel equipmentModel = getEquipment(id);
        Equipment equipment = Mapper.toDomain(equipmentModel);
        return Mapper.toModel(equipment);
    }

    private EquipmentModel getEquipment(long id) {
        return equipmentRepository.findById(id)
                .orElseThrow(() -> new EquipmentNotFoundException(id));
    }
}
