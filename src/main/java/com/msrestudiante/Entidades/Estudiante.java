package com.msrestudiante.Entidades;


import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "estudiante")
public class Estudiante {
    @Id
    private String id;
    private String Nombre;
    private String Apellido;

    private String Carne;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String carne) {

        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Carne = carne;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
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
