package br.com.empresa.banco.conta;

public abstract class Conta {
    
	protected double saldo;
    protected int numero;
	private String nome;
    
    public Conta(int numero){
    	this.numero = numero;
    }
    
    public Conta(){
    }
	
	public void deposita(double valorASerDepositado) throws ValorInvalidoException {		
		if (valorASerDepositado < 0) {
	        throw new ValorInvalidoException(valorASerDepositado);
	    } else {
	    	this.saldo += valorASerDepositado - 0.1;      
	    } 
	}
	
	public void saca(double valorASerSacado) throws Exception{
		if(saldo >= valorASerSacado){
			this.saldo -= valorASerSacado;
		}else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "esse objeto é uma conta com saldo R$" + this.saldo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean equals(Object obj, String nome) {
		Conta outraConta = (Conta) obj;
		String outroNome = (String) nome;
		
        if(this.numero == outraConta.numero && this.getNome().equals(outraConta.getNome())){
        	return true;
        }else{
        	return false;
        }
	}
	
	public int compareTo(Conta outraConta) {
		if(this.saldo < outraConta.getSaldo() || this.numero < outraConta.numero){
			return -1;
		}
		if(this.saldo > outraConta.getSaldo() || this.numero > outraConta.numero){
			return 1;
		}
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
}
