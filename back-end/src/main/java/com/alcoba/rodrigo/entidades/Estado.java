package com.alcoba.rodrigo.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "ESTADOS")
public class Estado implements Serializable {

    @Id
    @Column(name = "id_estado", nullable = false)
    private int id;

    @Column(name = "nom_estado", nullable = false)
    private String nomEstado;

    public Estado() {
    }

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


    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nomEstado='" + nomEstado + '\'' +
                '}';
    }
}
