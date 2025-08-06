package com.groupeisi.Exmen_java.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "sector", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<ClassEntity> classes;
}
