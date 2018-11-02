package com.msrestudiante.Controladores;

import com.msrestudiante.Entidades.Estudiante;
import com.msrestudiante.Repositorios.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.ReplayProcessor;

import java.time.Duration;

import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;

@RestController
@CrossOrigin
@RequestMapping("/estudiante")

public class ControladorEstudiante {

    private ReplayProcessor<ServerSentEvent<Estudiante>> replayProcessor =
            ReplayProcessor.<ServerSentEvent<Estudiante>>create();


    @Autowired
    private EstudianteRepositorio repoestudiante;

    @RequestMapping(
            value = "/all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public Flux<Estudiante> getall(){
        return repoestudiante.findAll();
    }


    @GetMapping(
            value = "/reactivo",
            produces = TEXT_EVENT_STREAM_VALUE
    )
    public Flux<Estudiante> getReactive(){
        return repoestudiante.findWithTailableCursorBy()
                .delayElements(Duration.ofMillis(1000));
    }

    @PostMapping(
            value = "/crear",
            produces = "application/json"
    )
    public Mono<Estudiante> crearestudiante(@RequestBody Estudiante estudiante){

        System.out.println(estudiante.getNombre());

        return repoestudiante.save(estudiante);
    }

}
