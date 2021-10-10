package br.com.zup;

public class Venda {
    private Cliente cliente;
    private Vendedor vendedorResponsavel;
    private double valorDaVenda;
    private String dataDeRegistro;

    public Venda() {

    }

    public Venda(Cliente cliente, Vendedor vendedorResponsavel, double valorDaVenda, String dataDeRegistro) {
        this.cliente = cliente;
        this.vendedorResponsavel = vendedorResponsavel;
        this.valorDaVenda = valorDaVenda;
        this.dataDeRegistro = dataDeRegistro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedorResponsavel() {
        return vendedorResponsavel;
    }

    public void setVendedorResponsavel(Vendedor vendedorResponsavel) {
        this.vendedorResponsavel = vendedorResponsavel;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }

    public String getDataDeRegistro() {
        return dataDeRegistro;
    }

    public void setDataDeRegistro(String dataDeRegistro) {
        this.dataDeRegistro = dataDeRegistro;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("***Extrato da Venda****");
        retorno.append("\n Cliente: " + getCliente());
        retorno.append("\n---------------------------------");
        retorno.append("\n Vendedor: " + getVendedorResponsavel());
        retorno.append("\n---------------------------------");
        retorno.append("\n Valor da Venda: " + valorDaVenda);
        retorno.append("\n Data de Registro: " + dataDeRegistro);
        retorno.append("\n**************************************");
        return retorno.toString();
    }
}
