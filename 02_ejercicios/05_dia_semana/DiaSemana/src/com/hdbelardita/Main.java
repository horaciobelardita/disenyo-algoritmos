package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short dia;
        do {
            System.out.print("Ingrese un numero (1-7): ");
            dia = Short.parseShort(br.readLine());
        } while (!(dia >= 1 && dia <= 7));
        String diaSemana;
        //  alternativa simple
        if (dia == 1) {
            diaSemana = "Lunes";
        } else if (dia == 2) {
            diaSemana = "Martes";
        } else if (dia == 3) {
            diaSemana = "Miercoles";
        } else if (dia == 4) {
            diaSemana = "Jueves";
        } else if (dia == 5) {
            diaSemana = "Viernes";
        } else if (dia == 6) {
            diaSemana = "Sabado";
        } else {
            diaSemana = "Domingo";
        }
        System.out.println(diaSemana);

        // alternativa múltiple
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
        }
        System.out.println(diaSemana);
    }
}
