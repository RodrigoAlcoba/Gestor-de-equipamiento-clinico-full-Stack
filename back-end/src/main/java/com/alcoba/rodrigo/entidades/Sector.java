package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "SECTORES")
public class Sector implements Serializable {

    @Id
    @Column(name = "id_sector")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_sector")
    @SequenceGenerator(name = "seq_sector", sequenceName = "seq_id_sector", allocationSize = 1)
    private Long id;

    @Column(name = "nom_sector", length = 50, nullable = false)
    private String nomSector;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomSector() {
        return nomSector;
    }

    public void setNomSector(String nomSector) {
        this.nomSector = nomSector;
    }

}
