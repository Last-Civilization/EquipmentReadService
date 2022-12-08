package com.lastcivilization.equipmentreadservice.domain.exception;

public class EquipmentNotFoundException extends RuntimeException{

    public EquipmentNotFoundException(Long id) {
        super("Cannot find equipment with id: %d".formatted(id));
    }
}

