package com.meepletic.servidor.jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class JugadorCon {

    @Autowired
    private JugadorSer servicio;


    @GetMapping("/jugadores")
    public List<Jugador> getTodosJugadores(){
        return servicio.getJugadores();
    }

    @GetMapping("/jugadores/{id}")
    public Jugador getJugador(@PathVariable long id){
        return servicio.getJugador(id);
    }
}
