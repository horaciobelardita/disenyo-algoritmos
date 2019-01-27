package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese base: ");
        double base = Double.parseDouble(br.readLine());

        System.out.print("Ingrese altura: ");
        double altura = Double.parseDouble(br.readLine());

        double area = base * altura / 2;

        System.out.format("Area: %.3f", area);

    }
}
