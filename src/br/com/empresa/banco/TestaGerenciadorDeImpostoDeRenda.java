package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = 
                    new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        try {
			cc.deposita(1000);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
        gerenciador.adiciona(cc);

        System.out.println(gerenciador.getTotal());
    }
}
