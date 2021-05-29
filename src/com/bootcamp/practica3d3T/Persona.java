package com.bootcamp.practica3d3T;

import com.bootcamp.practica3d3M.ComparatorFactory;
import com.bootcamp.practica3d3M.Precedable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Persona {

    private String nombre;
    private int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                '}';
    }
}
