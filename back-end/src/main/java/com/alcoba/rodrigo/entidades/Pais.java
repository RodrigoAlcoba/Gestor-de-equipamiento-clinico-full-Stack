package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "PAISES")
public class Pais implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pais")
    @SequenceGenerator(name = "seq_pais", sequenceName = "seq_id_pais", allocationSize = 1)
    @Column(name = "id_pais", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 50, nullable = false, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
