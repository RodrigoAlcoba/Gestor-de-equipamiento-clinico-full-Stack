package com.alcoba.rodrigo.entidades;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INTERVENCIONES")
public class Intervencion implements Serializable {

    @Id
    @Column(name = "id_intervencion")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_intervencion")
    @SequenceGenerator(name = "seq_intervencion", sequenceName = "seq_id_intervencion", allocationSize = 1)
    private Long id;

    @Column(name = "motivo", nullable = false)
    private String motivo;

    @Column(name = "observacion", nullable = false)
    private String observacion;

    @Column(name = "fecha_hora", nullable = false)
    private Date fechaHora;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipo equipo;

    @ManyToOne
    @JoinColumn(name = "id_institucion", nullable = false)
    private Institucion institucion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_intervencion", nullable = false)
    private TipoIntervencion tipoIntervencion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }
}
