package com.msrestudiante.msrestudiante.Repositorios;

import com.msrestudiante.msrestudiante.Entidades.Estudiante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EstudianteRepositorio extends ReactiveMongoRepository<Estudiante,String> {


    //Flux<Estudiante> findByNombre();
}
