package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //obter dados do usuario
    private static Scanner capturarDados(String mensagem) {
        Scanner capturarDados = new Scanner(System.in);
        System.out.println(mensagem);
        return capturarDados;
    }

    //cadastrar cliente
    public static Cliente cadastrarCliente() {
        String nome = capturarDados("Por favor, informe o nome do Cliente: ").nextLine();
        String cpf = capturarDados("Informe o CPF do cliente: ").nextLine();
        String email = capturarDados("Por fim, informe o email do cliente: ").nextLine();

        return ServicoCliente.cadastrarCliente(nome, cpf, email);
    }
}
