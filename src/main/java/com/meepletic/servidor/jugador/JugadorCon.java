package com.meepletic.servidor.jugador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;



@RestController
public class JugadorCon {

    @GetMapping("/jugadores")
    public List<Jugador> getTodosJugadores(){
        return Arrays.asList(
                new Jugador(1L, "Víctor", "viictor"),
                new Jugador(2L, "Anabel", "anabel")
        );
    }
}
