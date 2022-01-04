package br.dio;

import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clienteList;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "clienteList=" + clienteList +
                '}';
    }
}
