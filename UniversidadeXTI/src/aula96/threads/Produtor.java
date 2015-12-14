package aula96.threads;

import java.util.Random;

public class Produtor implements Runnable{

	//Nosso produtor ele precisa de uma ponte de comunica��o, portanto, vamos injetar a dependencia 
	//a classe Ponto direto pelo construtor, assim n�o vai ser poss�vel instanciar a classe produtor sem sua dependencia
	private PonteInterface ponte;
	public Produtor(PonteInterface ponte) {
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
				ponte.set(i);
				System.out.println("\t" + total);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
