package Ejercicios.uped.com;

import java.io.IOException;
public class Tasas {
    static double cargarTasa (String archivo) throws IOException {
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);
        }
        return 0.05;
    }
    public static void main(String[] args) {
        String[] archivos = { "tasas.csv", "tasas.pdf" };
        for (String a : archivos) {
            try {
                System.out.println(a + " -> tasa " + cargarTasa(a));
            } catch (IOException e) {
                System.out.println("Error de lectura: " + e.getMessage());
            }
        }
    }
}