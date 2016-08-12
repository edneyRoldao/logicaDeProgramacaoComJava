package aula64.desafioInputOutput;

public class ContaBancaria {

	private String cliente;

	private float saldo;
	
	
	// Construtores 
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String cliente, float saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}

	// M�todos
	public void exibirSaldo() {
		System.out.println("Exibindo o saldo: \n" + this.toString());
	}
	
	public void sacar(float valor) {
		System.out.println("Analizando solicita��o de saque: ");
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println("Opera��o realizado com sucesso.");
		}else {
			System.out.println("Saldo insuficiente \n opera��o negada.");
		}
	}

	public void depositar(float valor) {
		System.out.println("Realizando dep�sito...");
		saldo += valor;
		System.out.println("Opera��o realizado com sucesso.");
	}
	
	public void transferencia(ContaBancaria destino, float valor) {
		System.out.println("Analizando tranfer�ncia...");
		if(saldo >= valor) {
			saldo -= valor;
			destino.saldo += valor;
			System.out.println("\n Nome do favorecido: " + destino.cliente + "\n Opera��o concluida.");
		}else {
			System.out.println("Saldo insuficiente para opera��o \n opera��o negada.");
		}
	}
	
	// Getters and Setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + ", saldo=" + saldo + "]";
	}
	
}
