package com.msrestudiante.Entidades;


import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "estudiante")
public class Estudiante {
    @Id
    private String Id;
    private String Nombre;
    private String Apellido;

    private String Carne;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCarne() {
        return Carne;
    }

    public void setCarne(String carne) {
        Carne = carne;
    }
}
