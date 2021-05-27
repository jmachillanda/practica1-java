package com.bootcamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSort {

    public static String[] toStringArray(int[] arr) {
        String[] stringArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stringArray[i] = String.valueOf(arr[i]);
        }
        return stringArray;
    }

    public static String[] addPadToArrayElements(String[] arr) {
        int mayorLongitud = buscarMayorLongitudElemento(arr);

        for (int i = 0; i < arr.length; i++) {
            String elementoActual = arr[i];
            if (elementoActual.length() < mayorLongitud) {
                arr[i] = addPad(elementoActual, mayorLongitud);
            }
        }
        return arr;
    }

    public static String addPad(String string, int longitud) {
        StringBuilder pad = new StringBuilder();
        if (string.length() < longitud) {
            for (int i = 0; i < longitud - string.length(); i++) {
                pad.append("0");
            }
        }
        return pad + string;
    }

    public static int buscarMayorLongitudElemento(String[] arr) {
        int mayorLongitud = 0;
        for (int i = 0; i < arr.length; i++) {
            int longitudElementoActual = arr[i].length();
            if (longitudElementoActual > mayorLongitud) {
                mayorLongitud = longitudElementoActual;
            }
        }
        return mayorLongitud;
    }

    public static HashMap inicializarMap() {
        int numeroFilasRadixSort = 10;
        HashMap<Integer, ArrayList<String>> listas = new HashMap<>();
        for (int i = 0; i < numeroFilasRadixSort; i++) {
            listas.put(i, new ArrayList<>());
        }
        return listas;
    }

    public static ArrayList arrayToList(String[] arr) {
        ArrayList<String> lista = new ArrayList<>();
        for (String texto : arr) {
            lista.add(texto);
        }
        return lista;
    }

    public static String[] sort(String[] arr) {
        ArrayList<String> elementosOrdenados = arrayToList(arr);
        int mayorLongitud = buscarMayorLongitudElemento(arr);

        for (int i = mayorLongitud - 1; i >= 0; i--) {
            HashMap<Integer, ArrayList<String>> listas = inicializarMap();

            for (int j = 0; j < arr.length; j++) {
                String numeroActual = elementosOrdenados.get(j);
                String elementoActual = String.valueOf(numeroActual.charAt(i));
                listas.get(Integer.valueOf(elementoActual)).add(numeroActual);
            }

            elementosOrdenados = new ArrayList<>();
            for (Map.Entry<Integer, ArrayList<String>> entry : listas.entrySet()) {
                elementosOrdenados.addAll(entry.getValue());
            }
        }

        return toStringArray(elementosOrdenados);
    }

    public static String[] toStringArray(ArrayList<String> lista) {
        String[] arr = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            arr[i] = removePad(lista.get(i));
        }
        return arr;
    }

    public static String removePad(String numero) {
        int repeticiones = 0;
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '0') {
                repeticiones++;
            } else {
                break;
            }
        }
        return numero.substring(repeticiones);
    }

    public static void radixSort(int[] arr) {
        String[] arrString = toStringArray(arr);
        String[] arrStr = addPadToArrayElements(arrString);
        imprimirArray(sort(arrStr));
    }

    public static void imprimirArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        System.out.println("Original:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }

        System.out.println("\nRadix Sort:");
        radixSort(arr);
    }
}
