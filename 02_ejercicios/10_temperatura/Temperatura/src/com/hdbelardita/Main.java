package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Temperatura (ºC): ");
        double celsius = Double.parseDouble(br.readLine());


        char opcion;
        do {
            System.out.print("Elige F o K: ");
            opcion = br.readLine().toUpperCase().charAt(0);
        } while (opcion != 'F' && opcion != 'K');

        if (opcion == 'F') {
            double kelvin = 1.8 * celsius + 32;
            System.out.println("Grados F: " + kelvin);
        } else {
            double fahrenheit = celsius + 273.15;
            System.out.println("Grados K: " + fahrenheit);
        }
    }
}
