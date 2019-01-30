package com.hdbelardita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca una cantidad en euros: ");
        double euros = Double.parseDouble(br.readLine());

        System.out.print("Moneda a la que convertir (USD, GBP, CNY, JPY): ");
        String codigoDivisa = br.readLine();

        System.out.format("--- %.3f euros son %.3f %s ---", euros, calcularCambio(euros, codigoDivisa), obtenerDivisa(codigoDivisa));

    }

    public static double calcularCambio(double valor, String codigoDivisa) {
        double resultado;
        switch (codigoDivisa) {
            case "USD":
                resultado = valor * 1.15;
                break;
            case "GBP":
                resultado = valor * 0.88;
                break;
            case "CNY":
                resultado = valor * 7.97;
                break;
            case "JPY":
                resultado = valor * 124.96;
                break;
            default:
                resultado = 0;

        }
        return resultado;
    }

    public static String obtenerDivisa(String codigo) {
        String divisa;
        switch (codigo) {
            case "USD":
                divisa = "Dólares";
                break;
            case "GBP":
                divisa = "Libra esterlinas";
                break;
            case "CNY":
                divisa = "Yuan chinos";
                break;
            case "JPY":
                divisa = "Yenes";
                break;
                default:
                    divisa = "";
        }
        return divisa;
    }
}
