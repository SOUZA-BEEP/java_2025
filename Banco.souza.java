package exercicios321;

public class Banco {
   
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obterSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }
}