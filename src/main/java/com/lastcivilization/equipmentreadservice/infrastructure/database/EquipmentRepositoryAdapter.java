package com.lastcivilization.equipmentreadservice.infrastructure.database;

import com.lastcivilization.equipmentreadservice.domain.port.EquipmentRepository;
import com.lastcivilization.equipmentreadservice.domain.view.EquipmentModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.lastcivilization.equipmentreadservice.infrastructure.database.EntityMapper.MAPPER;

@Service
@RequiredArgsConstructor
class EquipmentRepositoryAdapter implements EquipmentRepository {

    private final EquipmentJpaRepository equipmentJpaRepository;

    @Override
    public Optional<EquipmentModel> findById(long id) {
        Optional<EquipmentEntity> equipmentEntity = equipmentJpaRepository.findById(id);
        return equipmentEntity.map(MAPPER::toDomain);
    }

    @Override
    public EquipmentModel save(EquipmentModel equipment) {
        EquipmentEntity equipmentEntity = MAPPER.toEntity(equipment);
        EquipmentEntity savedEquipmentEntity = equipmentJpaRepository.save(equipmentEntity);
        return MAPPER.toDomain(savedEquipmentEntity);
    }
}

