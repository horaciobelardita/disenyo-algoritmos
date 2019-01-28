package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numeroAleatorio = new Random().nextInt(101);

        System.out.print("Escribe un numero o FIN para terminar: ");
        String valor = br.readLine();

        int numeroIngresado = 0;
        int nroIntentos = 1;
        while (!valor.equals("FIN") && numeroIngresado != numeroAleatorio) {
            try {
                numeroIngresado = Integer.parseInt(valor);
                if (numeroIngresado == numeroAleatorio) {
                    System.out.println("Has adivinado era " + numeroAleatorio + " en " + nroIntentos + " intentos.");
                } else {
                    if (numeroIngresado < numeroAleatorio) {
                        System.out.println("Es mas alto");
                    } else {
                        System.out.println("Es mas bajo");
                    }
                    nroIntentos++;
                    System.out.print("Escribe un numero o FIN para terminar: ");
                    valor = br.readLine();
                }
            } catch (NumberFormatException e) {
                System.err.println("No has ingresado un numero....");
            }

        }
    }
}
