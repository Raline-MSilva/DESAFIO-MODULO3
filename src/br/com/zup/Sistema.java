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
    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Por favor, informe o nome do Cliente: ").nextLine();
        String cpf = capturarDados("Informe o CPF do cliente: ").nextLine();
        String email = capturarDados("Por fim, informe o email do cliente: ").nextLine();
        ServicoCliente.autenticarEmail(email);
        ServicoCliente.verificarCpf(cpf);
        ServicoCliente.verificarEmailExistente(email);

        return ServicoCliente.cadastrarCliente(nome, cpf, email);
    }

    //cadastrar vendedor
    public static Vendedor cadastrarVendedor() throws Exception{
        String nome = capturarDados("Por favor,informe o nome do vendedor: ").nextLine();
        String cpf = capturarDados("Informe o CPF do vendedor: ").nextLine();
        String email = capturarDados("Por fim, informe o email do vendedor: ").nextLine();
        ServicoVendedor.autenticarEmail(email);
        ServicoVendedor.verificarCpfRepetido(cpf);

        return ServicoVendedor.cadastrarVendedor(nome, cpf, email);
    }

    //cadastrar vendas
    public static Venda cadastrarVenda() throws Exception{
        double valorDaVenda = capturarDados("Por favor, informe o valor da compra: ").nextDouble();
        String dataDeRegistro = capturarDados("Informe a data da compra: ").nextLine();
        Cliente cliente = cadastrarCliente();
        Vendedor vendedor = cadastrarVendedor();

        return ServicoVenda.cadastrarVenda(cliente, vendedor, valorDaVenda, dataDeRegistro);
    }
}
