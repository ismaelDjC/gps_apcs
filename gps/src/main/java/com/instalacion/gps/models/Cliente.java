package com.instalacion.gps.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(referencedColumnName="id_persona")
public class Cliente extends Persona {

    private  String cedula;

    private  String estado;

    @OneToMany(mappedBy ="cliente")
    private  List<Vehiculo> vehiculos;

    public Cliente(String cedula, String estado) {
        this.cedula = cedula;
        this.estado = estado;
    }


	public String getCedula() {
        return cedula;
    }

	public Cliente() {

	}


	public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
