package com.groupeisi.Exmen_java.services;

import com.groupeisi.Exmen_java.entities.ClassEntity;

import java.util.List;
import java.util.Optional;

public interface ClassEntityService {
    ClassEntity saveClassEntity(ClassEntity classEntity);

    List<ClassEntity> getAllClassEntities();

    Optional<ClassEntity> getClassEntityById(Long id);

    ClassEntity updateClassEntity(Long id, ClassEntity classEntity);

    void deleteClassEntity(Long id);

    List<ClassEntity> getClassesBySectorId(Long sectorId);
}
