package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(String cpf, String email, double valorDaVenda, String dataDeRegistro) {
        Venda venda = new Venda(cpf, email, valorDaVenda, dataDeRegistro);
        vendas.add(venda);
        return venda;
    }

    //percorrendo lista para exibir
    public static void listarVenda() {
        System.out.println("Quantidade de vendas: " + vendas.size());
        for (Venda vendaReferencia : vendas) {
            System.out.println(vendaReferencia);
        }
    }
    //pesquisar todas as compras do cliente por cpf
    public static void pesquisarCompraPorCpf(String cpf) throws Exception {
        List<Venda> vendas = new ArrayList<>();
        for (Venda clienteCompra : vendas) {
            if (clienteCompra.getCliente().getCpf().equals(cpf)) {
                vendas.add(clienteCompra);
                System.out.println(clienteCompra);
            }
        }
        if (vendas.size() == 0){
            throw new Exception("Sem compras neste CPF");
        }
    }

    //pesquisar as vendas do vendedor pelo seu email
    public static void pesquisarVendaPorEmail (String email) throws Exception {
        List<Venda> vendas = new ArrayList<>();
        for (Venda vendedor : vendas) {
            if (vendedor.getVendedorResponsavel().getEmail().equals(email)) {
                vendas.add(vendedor);
                System.out.println(vendedor);
            }
        }
        if (vendas.size() == 0){
            throw new Exception("Sem vendas neste email");
        }
    }
}
