package aula103.reflections;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

	private static final long serialVersionUID = 1L;

	private double saldo;
	private int numeroConta;
	private String nomeUsuario;
	
	public String nomeBanco;

	// Construtores
	public ContaBancaria() {

	}

	public ContaBancaria(double saldo, int numeroConta, String nomeUsuario) {
		super();
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
	}
	

	@Override
	public String toString() {
		return "ContaBancaria [saldo=" + saldo + ", numeroConta=" + numeroConta + ", nomeUsuario=" + nomeUsuario
				+ ", nomeBanco=" + nomeBanco + "]";
	}

	// Métodos auxiliares
	public void depositar() {

	}

	public void sacar(double valor) {
		System.out.println("Voce sacou: " + valor);
	}

	public double consultar() {
		return saldo;
	}

	// Getters and Setters
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

}
