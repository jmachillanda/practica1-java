package com.bootcamp.practica2d2T;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String value;
    private String validationPattern;

    public Password(String value, String regex) {
        validatePassword(value, regex);
        this.value = value;
        this.validationPattern = regex;
    }

    private void validatePassword(String pwd, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pwd);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("La contraseña no cumple con el patrón de validación, revise la Regex o introduzca otra contraseña");
        }
    }

    public void setValue(String value) {
        validatePassword(value, validationPattern);
        this.value = value;
    }

    public static void main(String[] args) {
        Password password = new Password("foo", "fo");
    }
}
