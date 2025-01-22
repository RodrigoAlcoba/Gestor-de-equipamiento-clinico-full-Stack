package com.alcoba.rodrigo.entidades;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "AUDITORIAS")
public class Auditoria implements Serializable {

    @Id
    @Column(name = "id_auditoria")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auditoria_seq")
    @SequenceGenerator(name = "auditoria_seq", sequenceName = "seq_id_auditoria", allocationSize = 1)
    private Long id;

    @Column(name = "fec_auditoria", nullable = false)
    private Date fecha;

    @Column(name = "operacion", nullable = false)
    private String operacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false, insertable = false, updatable = false)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
