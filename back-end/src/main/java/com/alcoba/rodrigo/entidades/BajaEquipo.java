package com.alcoba.rodrigo.entidades;

import com.alcoba.rodrigo.entidades.pkcompuestas.BajaEquipoPK;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "BAJA_EQUIPOS")
public class BajaEquipo implements Serializable {

    @EmbeddedId
    private BajaEquipoPK id;

    @Column(name = "razon_baja", nullable = false, length = 50)
    private String razonBaja;

    @Column(name = "comentarios", nullable = false, length = 200)
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "institucion", nullable = false)
    private Institucion institucion;

    public BajaEquipoPK getId() {
        return id;
    }

    public void setId(BajaEquipoPK id) {
        this.id = id;
    }

    public String getRazonBaja() {
        return razonBaja;
    }

    public void setRazonBaja(String razonBaja) {
        this.razonBaja = razonBaja;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
}
