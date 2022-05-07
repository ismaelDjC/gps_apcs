package com.instalacion.gps.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "documentodescripcion")
public class DocumentoDescripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_documentodescripcion;
    private  String nombre;
    private  String estado;

    //fk_documentoservicio
   @ManyToOne
   @JoinColumn(name = "id_documentoservicio")
   private DocumentoServicio documentoservicio;

    //id_gps
    @OneToOne
    @JoinColumn(name="id_gps")
    private Gps gps;

    public DocumentoDescripcion(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }
    public DocumentoDescripcion(){}

    public Long getId_documentodescripcion() {
        return id_documentodescripcion;
    }
    public void setId_documentodescripcion(Long id_documentodescripcion) {
        this.id_documentodescripcion = id_documentodescripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
