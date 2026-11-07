package Ejercicios.uped.com;

import Ejercicios.uped.com.Entrada;

import javax.swing.JOptionPane;
public class InscripcionGUI {
    public static void main(String[] args) {
        try {
            int edad = Entrada.leerEntero("Edad del socio (16 a 80):", 16, 80);
            int meses = Entrada.leerEntero("Meses de membresia (1 a 12):", 1, 12);
            int r = JOptionPane.showConfirmDialog(null,
                    "<html>Confirma la inscripcion?<br>Edad: " + edad
                            + "<br>Meses: " + meses + "<br>Total: $" + (meses * 25)
                            + "</html>", "Gimnasio", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Inscripcion registrada");
            }
        } catch (IllegalStateException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}