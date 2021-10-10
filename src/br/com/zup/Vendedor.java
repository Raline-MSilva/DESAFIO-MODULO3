package br.com.zup;

public class Vendedor extends Pessoa {

    public Vendedor() {
    }

    public Vendedor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\t");
        retorno.append(super.toString());
        retorno.append("\n---------------------------------");
        return retorno.toString();
    }
}
