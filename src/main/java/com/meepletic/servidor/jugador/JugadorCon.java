package com.meepletic.servidor.jugador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class JugadorCon {

    @Autowired
    private JugadorSer servicio;


    // GET

    /**
     * Obtiene los datos de todos los jugadores.
     *
     * @return  Lista de todos los jugadores
     */
    @GetMapping("/jugadores")
    public List<Jugador> getTodosJugadores(){
        return servicio.getJugadores();
    }

    /**
     * Obtiene los datos de un jugador.
     *
     * @param id    Identificador del jugador a obtener
     *
     * @return  Jugador
     */
    @GetMapping("/jugadores/{id}")
    public Jugador getJugador(@PathVariable long id){
        return servicio.getJugador(id);
    }


    // POST

    /**
     * Añade un nuevo jugador.
     *
     * @param jugador   Jugador a añadir
     */
    @PostMapping("/jugadores")
    public void postJugador(@RequestBody Jugador jugador){
        servicio.postJugador(jugador);
    }


    // PUT

    /**
     * Sustituye los datos de un jugador por otros nuevos.
     *
     * @param jugador   Jugador con los nuevos datos
     */
    @PutMapping("/jugadores")
    public void putJugador(@RequestBody Jugador jugador){
        servicio.putJugador(jugador);
    }


    // DELETE
    
    /**
     * Elimina los datos de un jugador.
     *
     * @param id    Identificador del jugador a eliminar
     */
    @DeleteMapping("/jugadores/{id}")
    public void deleteJugador(@PathVariable long id){
        servicio.deleteJugador(id);
    }
}
