package com.msrestudiante.Repositorios;

import com.msrestudiante.Entidades.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Tailable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
//import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
//import reactor.core.publisher.Flux;

@Repository
public interface EstudianteRepositorio extends ReactiveCrudRepository<Estudiante,String> {

    @Tailable
    Flux<Estudiante> findWithTailableCursorBy();
}
