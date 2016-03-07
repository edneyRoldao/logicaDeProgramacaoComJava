package aula96.threads;

/**
 * 
 * @author edney.souza
 * 
 * O que vai acontecer nesta classe: 
 * 
 * Como esta � uma ponte n�o sincronizada, tanto a classe produtor quando consumidor v�o chamar seus 
 * respectivos m�todos de forma desordenada, ou seja, o Consumidor pode consumir mais do que � produzido
 * pelo Produtor e vice e versa. Este problema, est� solucionado na classe PonteSincronizada
 *
 */
public class TestPonteNaoSincronizada {

	public static void main(String[] args) {
		
		// Vamos declarar a interface Ponte e usar a ponteNaoSincronizada como op��o de implementa��o
		PonteInterface ponte = new PonteNaoSincronizada();
		
		//Vamos entender a linha abaixo:
		//Estamos declarando nossas threads, nela devemos passar qualquer classe que implementa  a interface Runnable
		//neste caso s�o as nossas classes Consumidor e Produtor, estas classes por sua vez tamb�m precisam receber como 
		//dependencia, qualquer classe que implemente a interface PonteInterface, neste caso � a classe acima PonteNaoSincronizada
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
		
	}

}
