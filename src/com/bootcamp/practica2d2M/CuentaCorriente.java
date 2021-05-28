package com.bootcamp.practica2d2M;

public class CuentaCorriente {

    private double saldo;

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
    }

    public CuentaCorriente(CuentaCorriente cc) {
        this.saldo = cc.saldo;
    }

    public CuentaCorriente() {
    }

    public void ingreso(double monto) {
        this.saldo += monto;
    }

    public void egreso(double monto) {
        this.saldo -= monto;
    }

    public double reintegro(double monto) {
        this.saldo += monto;
        return this.saldo;
    }

    public void transferencia(double monto, CuentaCorriente cc) {
        this.egreso(monto);
        cc.ingreso(monto);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = saldo;
    }
}
