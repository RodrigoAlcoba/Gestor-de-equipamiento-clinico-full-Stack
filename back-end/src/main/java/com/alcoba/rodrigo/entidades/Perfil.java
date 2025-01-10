package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PERFILES")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_perfiles")
    @SequenceGenerator(name = "seq_perfiles", sequenceName = "seq_id_perfil", allocationSize = 1)
    @Column(name = "id_perfil", nullable = false)
    private Long id;

    @Column(name = "nom_perfil", length = 50, nullable = false, unique = true)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
