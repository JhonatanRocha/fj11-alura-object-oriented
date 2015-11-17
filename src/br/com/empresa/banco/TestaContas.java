package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SaldoInsuficienteException;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaContas {
    public static void main(String[] args) {
		Conta jhol = new ContaCorrente();
		try {
			jhol.deposita(50.0);
		} catch (ValorInvalidoException e1) {
			e1.printStackTrace();
		}
		
		try{
			jhol.saca(100.0);
		}catch(SaldoInsuficienteException e){
			System.out.println("Saldo está insuficiente: " + e.getSaldoAtual());
		}
		catch(Exception e){
			System.out.println("Um outro erro qualquer...");
		}
		
		System.out.println(jhol.getSaldo());
		
		Conta conta = new ContaCorrente();
		try {
			conta.deposita(250);
		} catch (ValorInvalidoException e) {
			e.getMessage();
		}
		System.out.println(conta);
	}
}
