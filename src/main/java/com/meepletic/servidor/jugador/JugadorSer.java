package com.meepletic.servidor.jugador;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class JugadorSer {

    private List<Jugador> jugadores = new ArrayList<>(
            Arrays.asList(
                    new Jugador(1L, "Víctor", "viictor"),
                    new Jugador(2L, "Anabel", "anabeel")
            )
    );


    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public Jugador getJugador(long id) {
        return jugadores.stream()
                .filter(x -> x.getId() == id)
                .findFirst()
                .get();
    }

    public void postJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void putJugador(long id, Jugador jugador) {
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador actual = jugadores.get(i);

            if (actual.getId() == id) {
                jugadores.set(i, jugador);
                break;
            }
        }
    }

    public void deleteJugador(long id) {
        jugadores.removeIf(x -> x.getId() == id);
    }
}
