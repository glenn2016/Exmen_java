package com.groupeisi.Exmen_java.services;

import com.groupeisi.Exmen_java.entities.Sector;

import java.util.List;
import java.util.Optional;

public interface SectorService {
    Sector saveSector(Sector sector);

    List<Sector> getAllSectors();

    Optional<Sector> getSectorById(Long id);

    Sector updateSector(Long id, Sector sector);

    void deleteSector(Long id);
}
