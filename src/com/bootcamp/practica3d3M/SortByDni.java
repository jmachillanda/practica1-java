package com.bootcamp.practica3d3M;

import java.util.Comparator;

public class SortByDni implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni()-o2.getDni();
    }
}
