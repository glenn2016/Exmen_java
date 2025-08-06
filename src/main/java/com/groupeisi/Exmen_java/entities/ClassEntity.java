package com.groupeisi.Exmen_java.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "classes")
public class ClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;
    private String description;

    @ManyToOne
    @JoinColumn(name = "sector_id", nullable = false)
    @JsonBackReference
    private Sector sector;
}
