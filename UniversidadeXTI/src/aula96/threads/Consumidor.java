package aula96.threads;

import java.util.Random;

public class Consumidor implements Runnable{

	//Nosso produtor ele precisa de uma ponte de comunica��o, portanto, vamos injetar a dependencia 
	//a classe Ponto direto pelo construtor, assim n�o vai ser poss�vel instanciar a classe produtor sem sua dependencia
	private PonteInterface ponte;
	public Consumidor(PonteInterface ponte) {
		this.ponte = ponte;
	}
	
	Random random = new Random();
	
	//O m�todo run vai gerar informa��es que ser�o adicionadas na ponte
	@Override
	public void run() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			try {
				//Vamos colocar a thread para dormir em tempos aleat�rios
				Thread.sleep(random.nextInt(3000));
				total += i;
				
				ponte.get();//A �nica distin��o entre a classes Produtor( usa o set(valor) da ponte) e Consumidor( usa o get() da ponte) � esta linha
				
				System.err.println("\t" + total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
