package com.bootcamp.practica3d3M;

public class Celular implements Precedable<Celular>{

    private int numero;
    private String titular;

    public Celular(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                '}';
    }

    @Override
    public int precedeA(Celular celular) {
        return this.titular.compareTo(celular.titular);
    }

    public static void main(String[] args) {
        Celular c1 = new Celular(1, "A");
        Celular c2 = new Celular(2, "B");
        Celular c3 = new Celular(3, "C");

        Celular[] arrC = {c3, c2, c1};

        SortUtil.ordenar(arrC);

        for (Celular c: arrC){
            System.out.println(c);
        }

    }
}
