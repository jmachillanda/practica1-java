package com.bootcamp.practica2d2M;

public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion sumar(Fraccion fraccion) {
        if (this.denominador == fraccion.denominador) {
            return new Fraccion(this.numerador + fraccion.getNumerador(), this.denominador);
        } else {
            return new Fraccion(this.numerador + fraccion.numerador, this.denominador * fraccion.denominador);
        }
    }

    public Fraccion sumar(int numero) {
        return new Fraccion(numero * this.denominador + this.numerador, this.denominador);
    }

    public Fraccion restar(Fraccion fraccion) {
        if (this.denominador == fraccion.getDenominador()) {
            return new Fraccion(this.numerador - fraccion.getNumerador(), this.denominador);
        } else {
            return new Fraccion(this.numerador - fraccion.numerador, this.denominador * fraccion.denominador);
        }
    }

    public Fraccion restar(int numero) {
        return new Fraccion(numero * this.denominador - this.numerador, this.denominador);
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.numerador, this.denominador * fraccion.denominador);
    }

    public Fraccion multiplicar(int numero) {
        return new Fraccion(numero * this.numerador, this.denominador);
    }

    public Fraccion dividir(Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.numerador);
    }

    public Fraccion dividir(int numero) {
        return new Fraccion(this.numerador, this.denominador * numero);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
}
