package com.bootcamp.practica3d3M;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Persona implements Precedable<Persona> {

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

    @Override
    public int precedeA(Persona persona) {
        return this.dni - persona.dni;
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("a", 1123);
        Persona p2 = new Persona("b", 2123);
        Persona p3 = new Persona("c", 100);
        Persona[] arrP = {p3, p2, p1};

        //SortUtil.ordenar(arrP);

        List<Persona> personas = Arrays.asList(p3,p2,p1);

        Collections.sort(personas, ComparatorFactory.getInstance());

        for (Persona p: personas){
            System.out.println(p);
        }

    }
}
