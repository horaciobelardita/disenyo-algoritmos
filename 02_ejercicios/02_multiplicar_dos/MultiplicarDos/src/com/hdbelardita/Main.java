package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese un numero: ");
        int primerNumero = Integer.parseInt(br.readLine());

        System.out.print("Ingrese otro numero: ");
        int segundoNumero = Integer.parseInt(br.readLine());

        System.out.println(primerNumero + " x " + segundoNumero + " = " + primerNumero * segundoNumero);
    }
}
