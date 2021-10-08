package br.com.zup;

public class Main {

    public static void main(String[] args) {
        Sistema.cadastrarCliente();
        Sistema.cadastrarCliente();
        ServicoCliente.listarClientes();
        System.out.println("----------------------");
        Sistema.cadastrarVendedor();
        Sistema.cadastrarVendedor();
        ServicoVendedor.listarVendedor();
    }
}
