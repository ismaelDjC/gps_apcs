package com.instalacion.gps.models;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
@PrimaryKeyJoinColumn(referencedColumnName="id_persona")
public class Usuario extends Persona {

    private String password;

    private String estado;

    
    public Usuario(String password, String estado) {
        this.password = password;
        this.estado = estado;
    }
    public Usuario(){}
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    } 
}
