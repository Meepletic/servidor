package com.meepletic.servidor.jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class JugadorSer {

    @Autowired
    private JugadorRep repositorio;


    public List<Jugador> getJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        repositorio.findAll().forEach(jugadores::add);

        return jugadores;
    }

    public Jugador getJugador(long id) {
        return repositorio.findById(id).orElse(null);
    }

    public void postJugador(Jugador jugador) {
        repositorio.save(jugador);
    }

    public void putJugador(Jugador jugador) {
        repositorio.save(jugador);
    }

    public void deleteJugador(long id) {
        repositorio.deleteById(id);
    }
}
