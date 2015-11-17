package br.com.empresa.banco.conta;

public class ValorInvalidoException extends Exception {
	
	public ValorInvalidoException(double valorInvalido){
		super("Valor invalido: " + valorInvalido);
	}
}
