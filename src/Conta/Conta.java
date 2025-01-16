package Conta;

import java.util.List;

import static java.lang.String.format;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    Banco novoBanco = new Banco();

    // Atributos da classe
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    // Construtor da classe
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        novoBanco.adicionarContaBase(this);
    }


    // Métodos da classe
    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(format("Titular: %s", this.cliente.getNome()));
        System.out.println(format("Agencia: %d", this.agencia));
        System.out.println(format("Numero: %d", this.numero));
        System.out.println(format("Saldo: %.2f", this.saldo));
        //System.out.println(format("Lista de Clientes cadastrados no banco: "));
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso no valor de: " + valor +
                " para a conta do cliente: " + contaDestino.cliente.getNome());
    }
}
