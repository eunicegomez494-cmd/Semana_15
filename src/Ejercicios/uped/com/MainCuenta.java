package Ejercicios.uped.com;

import Ejercicios.uped.com.Cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Ana", 100);
        int[] depositos = { 50, -20, 30 };
        for (int d : depositos) {
            try {
                c.depositar(d);
                System.out.println("Deposito de " + d + " aceptado");
            } catch (IllegalArgumentException e) {
                System.out.println("Rechazado: " + e.getMessage());
            }
        }
        System.out.println("Saldo: " + c.getSaldo());
    }
}