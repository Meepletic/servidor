package com.meepletic.servidor.jugador;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;



@Service
public class JugadorSer {

    private List<Jugador> jugadores = Arrays.asList(
            new Jugador(1L, "Víctor", "viictor"),
                new Jugador(2L, "Anabel", "anabeel")
        );


    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
