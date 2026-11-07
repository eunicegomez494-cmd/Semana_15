package Ejercicios.uped.com;

public class Cuenta {
    private String titular;
    private int saldo;
    public Cuenta (String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar (int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser positivo: " + monto);
        }
        saldo += monto;
    }
    public void retirar(int monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException(
                    "El monto debe ser positivo: " + monto);
        }
        if (monto > saldo) {
            throw new IllegalStateException(
                    "Saldo insuficiente: disponible " + saldo);
        }
        saldo -= monto;
    }
    public int getSaldo() {
        return saldo;
    }
}