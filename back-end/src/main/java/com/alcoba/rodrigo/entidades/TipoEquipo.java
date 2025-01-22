package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TIPOS_EQUIPO")
public class TipoEquipo implements Serializable {

    @Id
    @Column(name = "id_tipo_equipo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_equipo_seq")
    @SequenceGenerator(name = "tipo_equipo_seq", sequenceName = "seq_id_tipo_equipo", allocationSize = 1)
    private long id;

    @Column(name = "nom_tipo_equipo", length = 50, nullable = false)
    private String nomTipoEquipo;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomTipoEquipo() {
        return nomTipoEquipo;
    }

    public void setNomTipoEquipo(String nomTipoEquipo) {
        this.nomTipoEquipo = nomTipoEquipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
