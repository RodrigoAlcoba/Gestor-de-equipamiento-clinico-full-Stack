package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TIPOS_INTERVENCION")
public class TipoIntervencion {

    @Id
    @Column(name = "id_tipo_intervencion")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tipo_intervencion")
    @SequenceGenerator(name = "seq_tipo_intervencion", sequenceName = "seq_id_tipo_intervencion", allocationSize = 1)
    private Long id;

    @Column(name = "nom_tipo_intervencion", length = 50, nullable = false)
    private String nomTipoIntervencion;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomTipoIntervencion() {
        return nomTipoIntervencion;
    }

    public void setNomTipoIntervencion(String nomTipoIntervencion) {
        this.nomTipoIntervencion = nomTipoIntervencion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
