package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "INSTITUCIONES")
public class Institucion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_institucion")
    @SequenceGenerator(name = "seq_institucion", sequenceName = "seq_id_institucion", allocationSize = 1)
    @Column(name = "id_institucion", nullable = false)
    private int id;

    @Column(name = "nom_institucion", length = 50, nullable = false, unique = true)
    private String nomInstitucion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomInstitucion() {
        return nomInstitucion;
    }

    public void setNomInstitucion(String nomInstitucion) {
        this.nomInstitucion = nomInstitucion;
    }

}
