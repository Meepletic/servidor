package com.meepletic.servidor.jugador;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Jugador {

    @Id
    private long id;
    private String nombre;
    private String usuario;


    // Constructores

    public Jugador() {

    }

    public Jugador(long id, String nombre, String usuario) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }


    // Getters

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }


    // Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    // Métodos

    @Override
    public String toString() {
        return "Jugador #" + id + ": " + nombre + " (" + usuario + ")";
    }
}
