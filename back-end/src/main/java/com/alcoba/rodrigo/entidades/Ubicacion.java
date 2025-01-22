package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "UBICACIONES")
public class Ubicacion implements Serializable {

    @Id
    @Column(name = "id_ubicacion")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ubicacion")
    @SequenceGenerator(name = "seq_ubicacion", sequenceName = "seq_id_ubicacion", allocationSize = 1)
    private Long id;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "cama", length = 50, nullable = false)
    private String cama;

    @Column(name = "piso", length = 50, nullable = false)
    private String piso;

    @ManyToOne
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_institucion", nullable = false)
    private Institucion institucion;

    @ManyToOne
    @JoinColumn(name = "id_sector", nullable = false)
    private Sector sector;

    // Getters y Setters

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

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }
}
