package com.bootcamp.practica3d3M;

public class SortUtil {

    public static <T extends Precedable> void ordenar(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].precedeA(arr[j + 1]) > 0) {
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
}
