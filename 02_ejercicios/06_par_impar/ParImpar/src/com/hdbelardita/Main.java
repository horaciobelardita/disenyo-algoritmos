package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(br.readLine());
        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        } else {
            System.out.println("Numero Impar");
        }
        System.out.println(numero % 2 == 0 ? "Numero Par" : "Numero Impar");
    }
}
