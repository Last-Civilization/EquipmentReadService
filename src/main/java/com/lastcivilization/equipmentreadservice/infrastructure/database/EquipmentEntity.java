package com.lastcivilization.equipmentreadservice.infrastructure.database;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "equipments")
public class EquipmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long helmet;
    private Long armor;
    private Long shoes;
    private Long pants;
    private Long weapon;
    private Long shield;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "backpack", referencedColumnName = "id")
    @Builder.Default
    private List<BackpackItemEntity> backpack = new ArrayList<>();
}
