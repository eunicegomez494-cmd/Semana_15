import Ejercicios.uped.com.Cuenta;
import Ejercicios.uped.com.DepositoGUI;

import javax.swing.JOptionPane;
public class DepositoRepetido {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Ana", 100);
        boolean listo = false;
        while (!listo) {
            String texto = JOptionPane.showInputDialog("Monto a depositar:");
            if (texto == null) {
                return;
            }
            try {
                cuenta.depositar(DepositoGUI.leerMonto(texto));
                listo = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Escriba solo numeros");
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Saldo: $" + cuenta.getSaldo());
    }
}