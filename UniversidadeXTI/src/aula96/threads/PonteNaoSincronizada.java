package aula96.threads;

public class PonteNaoSincronizada implements PonteInterface{
	
	private int valor = -1;

	@Override
	public void set(int valor) throws InterruptedException {
		System.out.print("Classe Produtor gerou: " + valor);
		this.valor = valor;
	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("Classe Consumidor utilizou: " + valor);
		return valor;
	}

}
