package com.alcoba.rodrigo.entidades;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "EQUIPOS")
public class Equipo {

    @Id
    @Column(name = "id_equipo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_equipo")
    @SequenceGenerator(name = "seq_equipo", sequenceName = "seq_id_equipo", allocationSize = 1)
    private Long id;

    @Column(name = "nom_equipo", length = 50, nullable = false)
    private String nombre;

    @Column(name = "modelo", length = 50, nullable = false)
    private String modelo;

    @Column(name = "marca", length = 50, nullable = false)
    private String marca;

    @Column(name = "num_serie", length = 50, nullable = false)
    private String numSerie;

    @Column(name = "imagen", nullable = false)
    private byte[] imagen;

    @Column(name = "fec_adquisicion", nullable = false)
    private LocalDate fecAdquisicion;

    @Column(name = "garantia", nullable = false)
    private LocalDate garantia;

    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    @ManyToOne
    @JoinColumn(name = "id_tipo_equipo", nullable = false)
    private TipoEquipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "id_sector", nullable = false)
    private Sector sector;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public LocalDate getGarantia() {
        return garantia;
    }

    public void setGarantia(LocalDate garantia) {
        this.garantia = garantia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public TipoEquipo getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getFecAdquisicion() {
        return fecAdquisicion;
    }

    public void setFecAdquisicion(LocalDate fecAdquisicion) {
        this.fecAdquisicion = fecAdquisicion;
    }
}
