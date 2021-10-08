package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarVendedor();
            Sistema.cadastrarVendedor();


        }catch (Exception deuErro){
            System.out.println(deuErro.getMessage());
        }
    }
}
