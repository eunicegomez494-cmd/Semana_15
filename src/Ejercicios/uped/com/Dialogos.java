package Ejercicios.uped.com;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;

public class Dialogos {
    static void confirmar() {
        int r = JOptionPane.showConfirmDialog(null,
                "Confirma el retiro de $50?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Retiro realizado");
        } else {
            JOptionPane.showMessageDialog(null, "Operacion cancelada");
        }
    }

    static void opciones() {
        String[] ops = { "Depositar", "Retirar", "Salir" };
        int i = JOptionPane.showOptionDialog(null, "Que desea hacer?",
                "Cajero", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, ops, ops[0]);
        if (i >= 0) {
            JOptionPane.showMessageDialog(null, "Eligio: " + ops[i]);
        }
    }

    static void lista() {
        String[] tipos = { "Ahorro", "Corriente", "Plazo fijo" };
        Object t = JOptionPane.showInputDialog(null, "Tipo de cuenta:",
                "Apertura", JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
        if (t != null) {
            JOptionPane.showMessageDialog(null, "Cuenta de " + t);
        }
    }

    static void formato() {
        String html = "<html><b>Comprobante</b><br>"
                + "Titular: Ana<br>Saldo: <font color='green'>$150</font></html>";
        JOptionPane.showMessageDialog(null, html);
    }

    static void fuenteIcono() {
        UIManager.put("OptionPane.messageFont",
                new Font("SansSerif", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont",
                new Font("SansSerif", Font.BOLD, 16));
        ImageIcon logo = new ImageIcon("logo.png");
        JOptionPane.showMessageDialog(null, "Bienvenido a la cooperativa",
                "Cooperativa", JOptionPane.PLAIN_MESSAGE, logo);
    }
}