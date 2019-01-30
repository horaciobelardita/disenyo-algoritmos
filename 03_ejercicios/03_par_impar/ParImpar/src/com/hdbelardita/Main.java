package com.hdbelardita;

public class Main {

    public static void main(String[] args) {
        System.out.println(esPar(10));
        System.out.println(esPar(7));

        System.out.println(esImpar(6));
        System.out.println(esImpar(11));
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static boolean esImpar(int numero) {
        return !esPar(numero);
    }
}
