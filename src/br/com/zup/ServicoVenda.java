package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();


    public static Venda cadastrarVenda(String cpf, String email, double valorDaVenda, String dataDeRegistro) throws Exception {
        Cliente cliente = ServicoCliente.pesquisarClientePorCpf(cpf);
        Vendedor vendedor = ServicoVendedor.pesquisarVendedorPorEmail(email);
        Venda venda = new Venda(cliente, vendedor, valorDaVenda, dataDeRegistro);
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
    public static List<Venda> pesquisarCompraPorCpf(String cpf) throws Exception {
        List<Venda> listaDeCompra = new ArrayList<>();
        for (Venda clienteCompra : vendas) {
            if (clienteCompra.getCliente().getCpf().equals(cpf)) {
                listaDeCompra.add(clienteCompra);
            }
        }
        return listaDeCompra;
    }

    /*//pesquisar as vendas do vendedor pelo seu email
    public static void pesquisarVendaPorEmail(String email) throws Exception {
        List<Venda> vendas = new ArrayList<>();
        for (Venda vendedor : vendas) {
            if (vendedor.getVendedorResponsavel().getEmail().equals(email)) {
                vendas.add(vendedor);
                System.out.println(vendedor);
            }
            throw new Exception("Sem vendas neste email");
        }

    }

     */
}
