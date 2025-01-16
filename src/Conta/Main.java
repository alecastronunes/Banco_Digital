package Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        boolean operacaoValida = true;
        int opcao = 0;

        Banco banco = new Banco();

        do {
            if (contador == 1) {
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Criar conta.");
                System.out.println("0 - Fechar programa.");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Informe um nome para o titular da conta: ");
                    String titular = sc.next();
                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(titular);
                    Conta novaConta = new ContaCorrente(novoCliente);
                    banco.adicionarContaBase(novaConta);
                    System.out.println("Conta criada com sucsso");
                    contador += 1;
                }

            }

            if (contador == 2) {
                System.out.println("Escolha uma opção: ");
                System.out.println("1 - Criar conta.");
                System.out.println("2 - Saldo");
                System.out.println("3 - Depositar");
                System.out.println("0 - Fechar programa.");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.println("Informe um nome para o titular da conta: ");
                    String titular = sc.next();
                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(titular);
                    Conta novaConta = new ContaCorrente(novoCliente);
                    banco.adicionarContaBase(novaConta);
                    System.out.println("Conta criada com sucsso");
                }
                if (opcao == 2) {
                    System.out.println(banco.titularDaConta().saldo);
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1 - Criar conta.");
                    System.out.println("2 - Saldo");
                    System.out.println("3 - Depositar");
                    System.out.println("0 - Fechar programa.");
                    opcao = sc.nextInt();
                    System.out.println(banco.titularDaConta().saldo);
                }
                if (opcao == 3) {
                    System.out.println("Informe um valor: ");
                    double deposito = sc.nextDouble();
                    banco.titularDaConta().depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!!!");

                }
            }


        } while (opcao != 0);
        operacaoValida = false;
        System.out.println("Operação finalizada!!!");
    }
}