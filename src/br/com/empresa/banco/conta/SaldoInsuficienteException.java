package br.com.empresa.banco.conta;

public class SaldoInsuficienteException extends RuntimeException {
	
	private final double saldoAtual;
	
	public SaldoInsuficienteException(double saldoAtual){
		super("Saldo atual insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}
}
