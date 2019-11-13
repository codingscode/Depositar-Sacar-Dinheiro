package entidade;

public class Info {

	private int numconta;
	private String nometitular;
	private double saldo;
	
	public Info(int numconta, String nometitular) {
		super();
		this.numconta = numconta;
		this.nometitular = nometitular;
	}

	public Info(int numconta, String nometitular, double saldo1) {
		super();
		this.numconta = numconta;
		this.nometitular = nometitular;
		deposito(saldo1);
	}

	public int getNumconta() {
		return numconta;
	}

	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}

	public String getNometitular() {
		return nometitular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void deposito (double valor) {
	    saldo += valor;
	}

	public void saque (double valor) {
	    saldo -= valor + 5.0;
	}

	public String toString() {
	     return "Conta "
	           + numconta
	           + ", Titular: "
	           + nometitular
	           + ", saldo: $"
	           + String.format("%.2f",saldo);
	}

	
	
}
