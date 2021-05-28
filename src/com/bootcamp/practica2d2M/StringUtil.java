package com.bootcamp.practica2d2M;

public class StringUtil {

    public static String rpad(String s, char c, int n) {
        for (int i = 0; i < n - s.length(); i++) {
            s += c;
        }
        return s;
    }

    public static String ltrim(String s) {
        return s.stripLeading();
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN(String s, char c, int n) {
        int indexNotFound = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                if (n == 1) {
                    return i;
                }
                n--;
            }
        }
        return indexNotFound;
    }

    public static void main(String[] args) {
        int l = indexOfN("John|Paul|George|Ringo", '|', 2);
        System.out.println(l);
    }
}
