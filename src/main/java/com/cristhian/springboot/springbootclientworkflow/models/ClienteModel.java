package com.cristhian.springboot.springbootclientworkflow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteModel extends PersonaModel {

    private Long clienteId;
    private String contrasena;
    private boolean estado;

    public ClienteModel() {
    }

    public ClienteModel(Long id, String direccion, int edad, String identificacion, String genero, 
        String nombre,Long telefono, Long clienteId, String contrasena, boolean estado
    ) {
        super(id, direccion, edad, identificacion, genero, nombre, telefono);
        this.clienteId = clienteId;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    @Column(name = "clienteid")
    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    @Column(length = 30)
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Column
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }    
}
