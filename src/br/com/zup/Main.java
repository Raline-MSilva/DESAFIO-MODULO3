package br.com.zup;

public class Main {

    public static void main(String[] args) {
        try {
            //Sistema.Executar();
            Sistema.cadastrarVenda();
            //ServicoVenda.pesquisarCompraPorCpf("123");


        }catch (Exception deuErro){
            System.out.println(deuErro.getMessage());
        }
    }
}
