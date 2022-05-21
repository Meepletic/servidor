package com.meepletic.servidor.jugador;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface JugadorRep extends CrudRepository<Jugador, Long> {

}
