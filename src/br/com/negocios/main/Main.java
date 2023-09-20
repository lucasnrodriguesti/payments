package br.com.negocios.main;

import br.com.negocios.dados.Conta;

public class Main {
    public static void main(String[] args) {

        Conta usuario = new Conta();
        usuario.setNome("Lucas");
        usuario.setNumeroDaConta(1000);
        usuario.setSaldo(32);

        usuario.exibaFicha();

    }
}