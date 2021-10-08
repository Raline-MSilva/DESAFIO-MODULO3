package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVenda {
    private static List<Venda> vendas = new ArrayList<>();

    public static Venda cadastrarVenda(Cliente cliente, Vendedor vendedor, double valorDaVenda, String dataDeRegistro) {
        Venda venda = new Venda(cliente, vendedor, valorDaVenda, dataDeRegistro);
        vendas.add(venda);
        return venda;
    }

    //percorrendo lista para exibir
    public static void listarVenda(){
        System.out.println("Quantidade de vendas: " + vendas.size());
        for (Venda vendaReferencia: vendas){
            System.out.println(vendaReferencia);
        }
    }
}
