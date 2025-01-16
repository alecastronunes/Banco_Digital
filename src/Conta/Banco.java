package Conta;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    //Atributos da classe
    public String nome;
    private List<Conta> listaDeContas = new ArrayList<>();

    public Conta titularDaConta() {
        return listaDeContas.get(0);
    }

    public void adicionarContaBase(Conta conta) {
        this.listaDeContas.add(conta);
    }

    public void listarContasBanco() {
        for (int i = 0; i <= listaDeContas.size() - 1; i++) {
            System.out.println(listaDeContas.get(i).cliente.nome);
        }
    }
}
