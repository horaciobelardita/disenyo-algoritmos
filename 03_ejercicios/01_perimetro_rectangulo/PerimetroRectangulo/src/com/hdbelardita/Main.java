package com.hdbelardita;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Base: ");
        double base = Double.parseDouble(br.readLine());

        System.out.print("Altura: ");
        double altura = Double.parseDouble(br.readLine());

        System.out.println("Perimetro: " + perimetroRectangulo(base, altura));

    }

     static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

}
