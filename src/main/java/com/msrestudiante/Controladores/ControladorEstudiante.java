package com.msrestudiante.Controladores;

import com.msrestudiante.Entidades.Estudiante;
import com.msrestudiante.Repositorios.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/estudiante")
//@EnableMongoRepositories(basePackages = "com.msrestudiante.Repositorios")
public class ControladorEstudiante {

    @Autowired
    EstudianteRepositorio estudiante;

    @RequestMapping(
            value = "/all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<Estudiante> getall(){
        List<Estudiante> result = estudiante.findAll();
        return result;
    }

    @RequestMapping("/saluda")
    public String saludo(){
        return "Hola Mundo";
    }
}
