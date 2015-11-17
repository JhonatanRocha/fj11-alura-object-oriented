package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(6, "Leonardo");
        ContaCorrente cc2 = new ContaCorrente(6, "Leonardo");

        if (cc == cc2)
            System.out.println("mesmo objeto");
        else 
            System.out.println("outro objeto");

        if (cc.equals(cc2))
            System.out.println("objeto equivalente");
        else 
            System.out.println("objeto nao equivalente");
	}
}
