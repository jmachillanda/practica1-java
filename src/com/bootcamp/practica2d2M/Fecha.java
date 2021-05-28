package com.bootcamp.practica2d2M;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private GregorianCalendar calendar;

    public Fecha(int day, int month, int year) {
        calendar = new GregorianCalendar(year, month, day);
    }

    public boolean isValidDate() {
        return isValidDay(getDay()) && isValidMonth(getMonth()) && isValidYear(getYear());
    }

    private boolean isValidDay(int day) {
        return day >= calendar.getMinimum(Calendar.DATE) || day <= calendar.getMaximum(Calendar.DATE);
    }

    private boolean isValidMonth(int month) {
        return month >= calendar.getMinimum(Calendar.MONTH) || month <= calendar.getMaximum(Calendar.MONTH);
    }

    private boolean isValidYear(int year) {
        return year >= calendar.getMinimum(Calendar.YEAR) || year <= calendar.getMaximum(Calendar.YEAR);
    }

    public void addDay() {
        calendar.add(Calendar.DATE, 1);
    }

    public int getDay() {
        return calendar.get(Calendar.DATE);
    }

    public void setDay(int day) {
        calendar.set(Calendar.DATE, day);
    }

    public int getMonth() {
        return calendar.get(Calendar.MONTH);
    }

    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month);
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public String toString() {
        return getDay() + "/" + getMonth() + "/" + getYear();
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(32, 2, 2021);
        System.out.println(fecha);
    }

}
