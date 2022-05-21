package com.meepletic.servidor.jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class JugadorCon {

    @Autowired
    private JugadorSer servicio;


    // GET

    @GetMapping("/jugadores")
    public List<Jugador> getTodosJugadores(){
        return servicio.getJugadores();
    }

    @GetMapping("/jugadores/{id}")
    public Jugador getJugador(@PathVariable long id){
        return servicio.getJugador(id);
    }


    // POST

    @PostMapping("/jugadores/nuevo")
    public void postJugador(@RequestBody Jugador jugador){
        servicio.postJugador(jugador);
    }
}
