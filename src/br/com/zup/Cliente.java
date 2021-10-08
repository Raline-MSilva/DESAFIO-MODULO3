package br.com.zup;

public class Cliente extends Pessoa{
    public Cliente() {

    }

    public Cliente(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\t");
        retorno.append(super.toString());
        return retorno.toString();
    }
}
