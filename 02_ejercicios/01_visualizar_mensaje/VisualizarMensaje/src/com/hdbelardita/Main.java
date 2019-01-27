package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Escribe un mensaje: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String mensaje = br.readLine();
        System.out.println("Has escrito: " + mensaje);
    }
}
