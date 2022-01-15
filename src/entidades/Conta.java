package entidades;

public abstract class Conta implements IConta{

    private int agencia;
    private int numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
