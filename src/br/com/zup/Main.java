package br.com.zup;

public class Main {

    public static void main(String[] args) {
        /*Sistema.cadastrarCliente();
        Sistema.cadastrarCliente();
        ServicoCliente.listarClientes();
        System.out.println("----------------------");
        Sistema.cadastrarVendedor();
        Sistema.cadastrarVendedor();
        ServicoVendedor.listarVendedor();

         */
        System.out.println("========================");
        Cliente cliente1 = new Cliente("Raline", "123456", "raline@raline");
        Cliente cliente2 = new Cliente("Maria", "98745", "maria@maria");
        Vendedor vendedor1 = new Vendedor("Ana", "147852", "ana@ana");
        Vendedor vendedor2 = new Vendedor("Cesar", "95632", "cesar@cesar");
        Venda venda1 = new Venda (cliente1,vendedor1, 25,"10/08/12");
        System.out.println(venda1.toString());
        System.out.println("-----------------------------------------------------------------------");
        Venda venda2 = new Venda(cliente2, vendedor2, 50, "05/14/98");
        System.out.println(venda2.toString());
        System.out.println("--------------------------------------------------------------------------");
    }
}
