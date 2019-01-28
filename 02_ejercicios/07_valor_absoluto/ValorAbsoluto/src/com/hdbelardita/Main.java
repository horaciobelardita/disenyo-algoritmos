package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.print("Ingrese un numero: ");
        int numero = Integer.parseInt(br.readLine());

        while (numero != 0) {
            if (numero < 0) {
                numero = numero * -1;
            }
            System.out.println("Valor absoluto: " + numero);
            System.out.print("Ingrese un numero: ");
            numero = Integer.parseInt(br.readLine());
        }
    }
}
