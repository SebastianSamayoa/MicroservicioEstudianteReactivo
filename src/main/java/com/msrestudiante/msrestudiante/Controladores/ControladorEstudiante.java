package com.msrestudiante.msrestudiante.Controladores;

import com.msrestudiante.msrestudiante.Entidades.Estudiante;
import com.msrestudiante.msrestudiante.Repositorios.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "estudiante")
public class ControladorEstudiante {

    @Autowired
    EstudianteRepositorio estudiante;

    @RequestMapping(
            value = "all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<Estudiante> getall(){
        List<Estudiante> result = (List<Estudiante>) estudiante.findAll();
        return result;
    }
}
