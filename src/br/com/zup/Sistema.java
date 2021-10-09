package br.com.zup;

import java.util.List;
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
        System.out.println("Digite 7 para pesquisar compra do cliente pelo CPF");
        System.out.println("Digite 8 para pesquisar venda do venddor pelo seu email");
        System.out.println("Digite 9 para sair do --Você em Divída--");
    }


    //cadastrar cliente
    public static Cliente cadastrarCliente() throws Exception{
        String nome = capturarDados("Por favor, informe o nome do Cliente: ").nextLine();
        String cpf = capturarDados("Informe o CPF do cliente: ").nextLine();
        String email = capturarDados("Por fim, informe o email do cliente: ").nextLine();
        ServicoCliente.autenticarEmail(email);
        ServicoCliente.verificarCpf(cpf);


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
        String cpf = capturarDados("Informe o cpf do cliente que deseja cadastrar a compra:").nextLine();
        String email = capturarDados("Informe o email do vendedor que deseja realizar a venda:").nextLine();
        double valorDaVenda = capturarDados("Por favor, informe o valor da compra: ").nextDouble();
        String dataDeRegistro = capturarDados("Informe a data da compra: ").nextLine();

        return ServicoVenda.cadastrarVenda(cpf, email, valorDaVenda, dataDeRegistro);
    }
    public static List<Venda> pesquisarCompraPorCpf () throws Exception {
        String cpf = capturarDados("Digite o CPF do cliente que deseja consultar:").nextLine();
        List<Venda> compraPorCpf = ServicoVenda.pesquisarCompraPorCpf(cpf){
            return compraPorCpf;
        }
    }

    public static void Executar() throws Exception{
        boolean menu = true;

        while (menu){
            menu();

            int opcaoDesejada = capturarDados("Informe a opção desejada: ").nextInt();

            if (opcaoDesejada == 1){
                cadastrarCliente();
            } else if (opcaoDesejada == 2){
                cadastrarVendedor();
            } else if (opcaoDesejada == 3){
                cadastrarVenda();
            } else if (opcaoDesejada == 4){
                ServicoCliente.listarClientes();
            } else if (opcaoDesejada == 5){
                ServicoVendedor.listarVendedor();
            } else if (opcaoDesejada == 6) {
                ServicoVenda.listarVenda();
            } else if (opcaoDesejada == 7){
                ServicoVenda.pesquisarCompraPorCpf();
            } else if (opcaoDesejada == 8){
                ServicoVenda.pesquisarVendaPorEmail();
            }else {
                menu = false;
                System.out.println("Cê saiu do sistema --Vendas Você em Divída--");
            }
        }
    }

}