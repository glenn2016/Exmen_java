package com.groupeisi.Exmen_java.repositories;

import com.groupeisi.Exmen_java.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClassEntityRepository extends JpaRepository<ClassEntity, Long> {
}
