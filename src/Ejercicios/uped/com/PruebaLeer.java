package Ejercicios.uped.com;

import Ejercicios.uped.com.DepositoGUI;

public class PruebaLeer {
    public static void main(String[] args) {
        String[] entradas = { "50", "25", "abc", "-10", "0" };
        for (String t : entradas) {
            try {
                System.out.println("\"" + t + "\" -> " + DepositoGUI.leerMonto(t));
            } catch (NumberFormatException e) {
                System.out.println("\"" + t + "\" -> NumberFormatException");
            } catch (IllegalArgumentException e) {
                System.out.println("\"" + t + "\" -> " + e.getMessage());
            }
        }
    }
}