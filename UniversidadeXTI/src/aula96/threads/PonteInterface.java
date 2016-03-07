package aula96.threads;

public interface PonteInterface {
	
	public void set(int valor) throws InterruptedException;
	
	public int get() throws InterruptedException;

}
