package com.alcoba.rodrigo.entidades;

import com.alcoba.rodrigo.entidades.pkcompuestas.BajaUbicacionPK;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "BAJA_UBICACIONES")
public class BajaUbicacion implements Serializable {

    @EmbeddedId
    private BajaUbicacionPK id;

    @Column(name = "razon_baja", nullable = false, length = 255)
    private String razonBaja;

    @Column(name = "comentarios", nullable = false, length = 500)
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "institucion", nullable = false)
    private Institucion institucion;


    public BajaUbicacionPK getId() {
        return id;
    }

    public void setId(BajaUbicacionPK id) {
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