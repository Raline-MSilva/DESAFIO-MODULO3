package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //obter dados do usuario
    private static Scanner capturarDados(String mensagem) {
        Scanner capturarDados = new Scanner(System.in);
        System.out.println(mensagem);
        return capturarDados;
    }
}
