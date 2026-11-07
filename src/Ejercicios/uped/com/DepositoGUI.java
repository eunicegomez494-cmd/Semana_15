package Ejercicios.uped.com;

import Ejercicios.uped.com.Cuenta;

import javax.swing.JOptionPane;
public class DepositoGUI {
    public static int leerMonto(String texto) {
        int monto = Integer.parseInt(texto.trim());
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor que cero");
        }
        return monto;
    }
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 100);
        String texto = JOptionPane.showInputDialog(null,
                "Monto a depositar:", "Cajero",
                JOptionPane.QUESTION_MESSAGE);
        if (texto == null) {
            return;
        }
        try {
            cuenta.depositar(leerMonto(texto));
            JOptionPane.showMessageDialog(null,
                    "Deposito aceptado. Saldo: $" + cuenta.getSaldo(),
                    "Cajero", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Escriba solo numeros: \"" + texto + "\"",
                    "Dato invalido", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Monto invalido", JOptionPane.WARNING_MESSAGE);
        }
    }
}