package com.alcoba.rodrigo.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PROVEEDORES")
public class Proveedor {

    @Id
    @Column(name = "id_proveedor")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_proveedor")
    @SequenceGenerator(name = "seq_proveedor", sequenceName = "seq_id_proveedor", allocationSize = 1)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
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
