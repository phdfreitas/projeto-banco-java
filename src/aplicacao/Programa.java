package aplicacao;

import entidades.Conta;
import entidades.ContaCorrente;
import entidades.ContaPoupanca;

public class Programa {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.depositar(500);

        System.out.println(poupanca.getSaldo());
        cc.transferir(poupanca, 250);

        System.out.println(cc.getSaldo());
        System.out.println(poupanca.getSaldo());

    }

}
