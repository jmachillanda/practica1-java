package com.bootcamp.practica3d3M;

import java.util.Comparator;

public class ComparatorFactory {

    public static Comparator getInstance() {
        return new SortByDni();
    }
}
