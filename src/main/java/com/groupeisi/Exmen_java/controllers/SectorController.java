package com.groupeisi.Exmen_java.controllers;

import com.groupeisi.Exmen_java.entities.Sector;
import com.groupeisi.Exmen_java.services.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sectors")
public class SectorController {

    private final SectorService sectorService;

    @Autowired
    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @PostMapping
    public Sector createSector(@RequestBody Sector sector) {
        return sectorService.saveSector(sector);
    }

    @GetMapping
    public List<Sector> getAllSectors() {
        return sectorService.getAllSectors();
    }

    @GetMapping("/{id}")
    public Sector getSectorById(@PathVariable Long id) {
        return sectorService.getSectorById(id)
                .orElseThrow(() -> new RuntimeException("Sector not found"));
    }

    @PutMapping("/{id}")
    public Sector updateSector(@PathVariable Long id, @RequestBody Sector sector) {
        return sectorService.updateSector(id, sector);
    }

    @DeleteMapping("/{id}")
    public void deleteSector(@PathVariable Long id) {
        sectorService.deleteSector(id);
    }
}
