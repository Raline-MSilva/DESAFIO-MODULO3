package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //obter dados do usuario
    private static Scanner capturarDados(String mensagem) {
        Scanner capturarDados = new Scanner(System.in);
        System.out.println(mensagem);
        return capturarDados;
    }

    //Criar menu
    public static void menu (){
        System.out.println("**Bem vindo ao sistema de Vendas Você em Divída!**");
        System.out.println("Digite 1 para cadastrar um cliente");
        System.out.println("Digite 2 para cadastrar um vendedor");
        System.out.println("Digite 3 para realizar uma venda");
        System.out.println("Digite 4 para exibir a lista de Clientes");
        System.out.println("Digite 5 para exibir a lista de vendedores");
        System.out.println("Digite 6 para exibir a lista de vendas");
        System.out.println("Digite 7 para sair do Você em Divída");
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
        ServicoVendedor.verificarEmailExistente(email);

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
