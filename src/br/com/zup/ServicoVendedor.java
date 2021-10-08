package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    public static List<Vendedor> vendedores = new ArrayList<>();

    public static Vendedor cadastrarVendedor(String nome, String cpf, String email){
        Vendedor vendedor = new Vendedor(nome,cpf,email);
        vendedores.add(vendedor);
        return vendedor;
    }


    //percorrendo lista para exibir
    public static void listarVendedor (){
        System.out.println("Quantidade de vendedores: " + vendedores.size());
        for (Vendedor vendedorReferencia : vendedores){
            System.out.println(vendedorReferencia);
        }
    }
}
