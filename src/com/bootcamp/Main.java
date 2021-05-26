package com.bootcamp;

import java.util.Scanner;

public class Main {

    public static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de números pares:");
        int cantidadNumerosPares = scanner.nextInt();

        for (int i = 0; cantidadNumerosPares > 0; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                cantidadNumerosPares--;
            }
        }
        scanner.close();
    }

    public static void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número para saber sus múltiplos:");
        int numeroIngresado = scanner.nextInt();
        System.out.println("Ingrese cantidad de múltiplos:");
        int cantidadMultiplos = scanner.nextInt();

        for (int i = 0; cantidadMultiplos > 0; i++) {
            if (i % numeroIngresado == 0) {
                System.out.print(i + " ");
                cantidadMultiplos--;
            }
        }
        scanner.close();
    }

    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número para determinar si es primo:");
        int numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de números primos:");
        int cantidadNumerosPrimos = scanner.nextInt();

        for (int i = 2; cantidadNumerosPrimos != 0; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
                cantidadNumerosPrimos--;
            }
        }
        scanner.close();
    }

    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad de números naturales a mostrar:");
        int cantidadNumerosNaturales = scanner.nextInt();
        System.out.println("Ingrese la cantidad de dígitos:");
        int repeticiones = scanner.nextInt();
        System.out.println("Ingrese el dígito:");
        int digito = scanner.nextInt();

        for (int i = 0; cantidadNumerosNaturales > 0; i++) {
            if (tieneDigitoRepetido(i, digito, repeticiones)) {
                System.out.print(i + " ");
                cantidadNumerosNaturales--;
            }
        }

    }

    public static boolean tieneDigitoRepetido(int numero, int digito, int repeticiones) {
        String numeroString = String.valueOf(numero);
        char digitoChar = Character.forDigit(digito, 10);
        int repeticionesEncontradas = 0;

        for (int i = 0; i < numeroString.length() && repeticionesEncontradas < repeticiones; i++) {
            if (numeroString.charAt(i) == digitoChar) {
                repeticionesEncontradas++;
            }
        }

        return repeticionesEncontradas >= repeticiones;
    }

    public static void main(String[] args) {
        ejercicio5();
    }

}
