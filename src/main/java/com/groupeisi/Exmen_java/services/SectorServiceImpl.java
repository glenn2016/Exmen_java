package com.groupeisi.Exmen_java.services;

import com.groupeisi.Exmen_java.entities.Sector;
import com.groupeisi.Exmen_java.repositories.SectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectorServiceImpl implements SectorService{

    private final SectorRepository sectorRepository;

    @Autowired
    public SectorServiceImpl(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    @Override
    public Sector saveSector(Sector sector) {
        return sectorRepository.save(sector);
    }

    @Override
    public List<Sector> getAllSectors() {
        return sectorRepository.findAll();
    }

    @Override
    public Optional<Sector> getSectorById(Long id) {
        return sectorRepository.findById(id);
    }

    @Override
    public Sector updateSector(Long id, Sector updatedSector) {
        return sectorRepository.findById(id).map(sector -> {
            sector.setName(updatedSector.getName());
            return sectorRepository.save(sector);
        }).orElseThrow(() -> new RuntimeException("Sector not found with id " + id));
    }

    @Override
    public void deleteSector(Long id) {
        sectorRepository.deleteById(id);
    }
}
