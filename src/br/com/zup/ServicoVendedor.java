package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoVendedor {

    public static List<Vendedor> vendedores = new ArrayList<>();

    //Cadastrar Vendedor
    public static Vendedor cadastrarVendedor(String nome, String cpf, String email) {
        Vendedor vendedor = new Vendedor(nome, cpf, email);
        vendedores.add(vendedor);
        return vendedor;
    }


    //percorrendo lista para exibir
    public static void listarVendedor() {
        System.out.println("Quantidade de vendedores: " + vendedores.size());
        for (Vendedor vendedorReferencia : vendedores) {
            System.out.println(vendedorReferencia);
        }
    }

    //não permite cadastrar email sem @
    public static void autenticarEmail(String email) throws Exception {
        if (!email.contains("@" + ".com")) {
            throw new Exception("Email inválido, favor digitar um válido com o @ e .com!");
        }
    }

    //não permitir cadastro com cpf repetido
    public static void verificarCpfRepetido(String cpf) throws Exception {
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getCpf().equals(cpf)) {
                throw new Exception("CPF já existe em nosso sistema!");
            }
        }
    }

    //percorre a lista para não cadastrar email repetidos
    public static void verificarEmailExistente(String email) throws Exception {
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getEmail().equals(email)) {
                throw new Exception("Email já cadastrado no sistema!");
            }
        }
    }

    //percorre a lista para cadastrar vendedor na venda
    public static Vendedor pesquisarVendedorPorEmail(String email) throws Exception {
        for (Vendedor vendedorReferencia : vendedores) {
            if (vendedorReferencia.getEmail().equals(email)) {
                return vendedorReferencia;
            }
        }
        throw new Exception("E-mail não encontrado!");
    }
}
