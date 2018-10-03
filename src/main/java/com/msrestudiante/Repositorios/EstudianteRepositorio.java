package com.msrestudiante.Repositorios;

import com.msrestudiante.Entidades.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
//import reactor.core.publisher.Flux;

@Repository
public interface EstudianteRepositorio extends MongoRepository<Estudiante,String> {


    //Flux<Estudiante> findByNombre();
}
