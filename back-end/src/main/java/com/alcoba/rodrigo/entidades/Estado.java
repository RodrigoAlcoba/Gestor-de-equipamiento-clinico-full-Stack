package com.alcoba.rodrigo.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTADOS")
public class Estado {

    @Id
    @Column(name = "id_estado", nullable = false)
    private int id;

    @Column(name = "nom_estado", nullable = false)
    private String nomEstado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }
}
