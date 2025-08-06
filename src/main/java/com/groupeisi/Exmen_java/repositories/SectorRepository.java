package com.groupeisi.Exmen_java.repositories;

import com.groupeisi.Exmen_java.entities.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SectorRepository extends JpaRepository<Sector, Long> {
}
