package Ejercicios.uped.com;

import java.io.IOException;
public class Cadena {
    static double cargarTasa (String archivo) throws IOException {
        System.out.println(" cargarTasa(" + archivo + ")");
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);
        }
        return 0.05;
    }
    static double calcularInteres (int saldo, String archivo) throws IOException {
        System.out.println(" calcularInteres");
        return saldo * cargarTasa(archivo);
    }
    public static void main(String[] args) {
        try {
            System.out.println("Interes: " + calcularInteres(1000, "tasas.csv"));
            System.out.println("Interes: " + calcularInteres(1000, "tasas.xls"));
        } catch (IOException e) {
            System.out.println("main atrapa: " + e.getMessage());
        }
    }
}