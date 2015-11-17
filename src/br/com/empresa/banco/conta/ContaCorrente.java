package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{
	
	private String titular;
	
	public ContaCorrente(int numero, String titular) {
		super(numero);
		this.titular = titular;
	}
	
	public ContaCorrente(int numero) {
		super(numero);
	}
	
	public ContaCorrente() {
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2; 
    }
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}