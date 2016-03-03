package aula96.threads;

/**
 * 
 * @author edney.souza
 * 
 * O que vai acontecer nesta classe: 
 * 
 * Como esta é uma ponte não sincronizada, tanto a classe produtor quando consumidor vão chamar seus 
 * respectivos métodos de forma desordenada, ou seja, o Consumidor pode consumir mais do que é produzido
 * pelo Produtor e vice e versa. Este problema, está solucionado na classe PonteSincronizada
 *
 */
public class TestPonteNaoSincronizada {

	public static void main(String[] args) {
		
		// Vamos declarar a interface Ponte e usar a ponteNaoSincronizada como opção de implementação
		PonteInterface ponte = new PonteNaoSincronizada();
		
		//Vamos entender a linha abaixo:
		//Estamos declarando nossas threads, nela devemos passar qualquer classe que implementa  a interface Runnable
		//neste caso são as nossas classes Consumidor e Produtor, estas classes por sua vez também precisam receber como 
		//dependencia, qualquer classe que implemente a interface PonteInterface, neste caso é a classe acima PonteNaoSincronizada
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
		
	}

}
