package com.instalacion.gps.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "documentoservicio")
public class DocumentoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_documentoservicio;


    private Date fecha_ds;

    private Integer hora;

    private  String observaciones;

    private Date fecha_inicion;

    private Date fecha_fin;

    private String Estado;

    //id_gps
    @OneToOne
    @JoinColumn(name="id_gps")
    private Gps gps;
    
    //id_vehiculo
    @OneToOne
    @JoinColumn(name="id_vehiculo")
    private Vehiculo vehiculo;
   
    //fk_docdescricion
    @OneToMany(mappedBy = "documentoservicio")
    private List<DocumentoDescripcion> docdescripcion;
    //imagen



    public DocumentoServicio(Date fecha_ds, Integer hora, String observaciones, Date fecha_inicion, Date fecha_fin,
            String estado) {
        this.fecha_ds = fecha_ds;
        this.hora = hora;
        this.observaciones = observaciones;
        this.fecha_inicion = fecha_inicion;
        this.fecha_fin = fecha_fin;
        Estado = estado;
    }
    public DocumentoServicio(){}

    public Gps getGps() {
		return gps;
	}
	public void setGps(Gps gps) {
		this.gps = gps;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public List<DocumentoDescripcion> getDocdescripcion() {
		return docdescripcion;
	}
	public void setDocdescripcion(List<DocumentoDescripcion> docdescripcion) {
		this.docdescripcion = docdescripcion;
	}
	public Long getId_documentoservicio() {
        return id_documentoservicio;
    }
    public void setId_documentoservicio(Long id_documentoservicio) {
        this.id_documentoservicio = id_documentoservicio;
    }
    public Date getFecha_ds() {
        return fecha_ds;
    }
    public void setFecha_ds(Date fecha_ds) {
        this.fecha_ds = fecha_ds;
    }
    public Integer getHora() {
        return hora;
    }
    public void setHora(Integer hora) {
        this.hora = hora;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public Date getFecha_inicion() {
        return fecha_inicion;
    }
    public void setFecha_inicion(Date fecha_inicion) {
        this.fecha_inicion = fecha_inicion;
    }
    public Date getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
}
