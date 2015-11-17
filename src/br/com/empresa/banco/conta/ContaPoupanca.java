package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<Conta>{

	private String titular;
	
	public ContaPoupanca(int numero, String titular) {
		super(numero);
		this.titular = titular;
	}
	
	public ContaPoupanca(int numero) {
		super(numero);
	}
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
	
	@Override
    public int compareTo(Conta outra) {
        return this.titular.compareTo(outra.getNome());
    }
/*
	@Override
	public int compareTo(Conta outraConta) {
		if(this.saldo < outraConta.getSaldo()){
			return -1;
		}
		if(this.saldo > outraConta.getSaldo()){
			return 1;
		}
		return 0;
	}
*/    
	/*	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3; 
    }*/
}
