package com.groupeisi.Exmen_java.services;

import com.groupeisi.Exmen_java.entities.ClassEntity;
import com.groupeisi.Exmen_java.repositories.ClassEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassEntityServiceImpl  implements ClassEntityService {

    private final ClassEntityRepository classEntityRepository;

    @Autowired
    public ClassEntityServiceImpl(ClassEntityRepository classEntityRepository) {
        this.classEntityRepository = classEntityRepository;
    }

    @Override
    public ClassEntity saveClassEntity(ClassEntity classEntity) {
        return classEntityRepository.save(classEntity);
    }

    @Override
    public List<ClassEntity> getAllClassEntities() {
        return classEntityRepository.findAll();
    }

    @Override
    public Optional<ClassEntity> getClassEntityById(Long id) {
        return classEntityRepository.findById(id);
    }

    @Override
    public ClassEntity updateClassEntity(Long id, ClassEntity updatedClassEntity) {
        return classEntityRepository.findById(id).map(classEntity -> {
            classEntity.setClassName(updatedClassEntity.getClassName());
            classEntity.setDescription(updatedClassEntity.getDescription());
            classEntity.setSector(updatedClassEntity.getSector());
            return classEntityRepository.save(classEntity);
        }).orElseThrow(() -> new RuntimeException("ClassEntity not found with id " + id));
    }

    @Override
    public void deleteClassEntity(Long id) {
        classEntityRepository.deleteById(id);
    }

    @Override
    public List<ClassEntity> getClassesBySectorId(Long sectorId) {
        // Tu peux décommenter cette méthode si tu l’as dans le repository
        return classEntityRepository.findAll().stream()
                .filter(c -> c.getSector() != null && c.getSector().getId().equals(sectorId))
                .toList();
    }
}
