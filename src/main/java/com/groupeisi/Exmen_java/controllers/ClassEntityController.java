package com.groupeisi.Exmen_java.controllers;

import com.groupeisi.Exmen_java.entities.ClassEntity;
import com.groupeisi.Exmen_java.services.ClassEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classes")
public class ClassEntityController {

    private final ClassEntityService classEntityService;

    @Autowired
    public ClassEntityController(ClassEntityService classEntityService) {
        this.classEntityService = classEntityService;
    }

    @PostMapping
    public ClassEntity createClass(@RequestBody ClassEntity classEntity) {
        return classEntityService.saveClassEntity(classEntity);
    }

    @GetMapping
    public List<ClassEntity> getAllClasses() {
        return classEntityService.getAllClassEntities();
    }

    @GetMapping("/{id}")
    public ClassEntity getClassById(@PathVariable Long id) {
        return classEntityService.getClassEntityById(id)
                .orElseThrow(() -> new RuntimeException("ClassEntity not found"));
    }

    @PutMapping("/{id}")
    public ClassEntity updateClass(@PathVariable Long id, @RequestBody ClassEntity classEntity) {
        return classEntityService.updateClassEntity(id, classEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteClass(@PathVariable Long id) {
        classEntityService.deleteClassEntity(id);
    }

    @GetMapping("/by-sector/{sectorId}")
    public List<ClassEntity> getClassesBySectorId(@PathVariable Long sectorId) {
        return classEntityService.getClassesBySectorId(sectorId);
    }
}
