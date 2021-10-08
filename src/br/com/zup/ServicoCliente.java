package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoCliente {
    private static List<Cliente> clientes = new ArrayList<>();

    public static Cliente cadastrarCliente(String nome, String cpf, String email) {
        Cliente cliente = new Cliente(nome, cpf, email);
        clientes.add(cliente);
        return cliente;
    }

    //exibir os clientes percorrendo a lista
    public static void listarClientes() {
        System.out.println("Quantidade de clientes: " + clientes.size());
        for (Cliente clienteReferencia : clientes) {
            System.out.println(clienteReferencia);
        }
    }
}
