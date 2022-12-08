package com.lastcivilization.equipmentreadservice.domain.port;


import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;

import java.util.Optional;

public interface EquipmentRepository {

    Optional<EquipmentModel> findById(long id);

    EquipmentModel save(EquipmentModel equipment);
}

