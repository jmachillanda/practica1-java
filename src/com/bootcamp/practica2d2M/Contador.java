package com.bootcamp.practica2d2M;

public class Contador {

    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public Contador(Contador contador) {
        this.valor = contador.valor;
    }

    public Contador() {
    }

    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
