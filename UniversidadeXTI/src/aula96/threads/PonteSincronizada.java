package aula96.threads;

/**
 * 
 * @author edney.souza
 *
 *Objetivo desta classe:
 *N�s queremos que as Threads da classe Consumidor e Produtor trabalhem de forma sincronizada.
 *Quando o Produtor gerar algum valor, o Consumidor deve consumir o valor produzido.
 *Uma vai ficar aguardando a outro para executarem seus respectivos m�todos
 *
 */
public class PonteSincronizada implements PonteInterface{

	private int valor = -1;
	private boolean ponteOcupada = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
	
		// Se a ponte estiver ocupada, o produtor no pode produzir nada
		while(ponteOcupada) {
			//Se a ponto j� estiver com valor(ocupada), o Produtor precisa aguardar o consumidor retirar tal valor
			System.out.println("Ponte cheia. Produtor deve aguardar");
			wait(); // Esta instru��o faz com que a Thread que est� executando este m�todo aguarde
		}
			
		System.out.print("Classe Produtor gerou: " + valor);
		this.valor = valor;
		
		//Quando o produtor estiver usando a ponte, ele precisa marcar a ponte como ocupada para o consumidor n�o usar
		ponteOcupada = true;
		
		//Temos que notificar todos as Threads quando o estado da condi��o de execu��o desta mudou ou n�o
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		
		while(!ponteOcupada) {
			//Se a ponte estiver vazia(!= ocupada), significa que a classe Consumidora j� retirou o valor de l�, portanto
			//Consumidor aguarda o produtor inserir um novo valor
			System.out.println("Ponte Vazia. Consumidor Aguarda");
			wait();
		}
		System.err.print("Classe Consumidor utilizou: " + valor);
		//Ap�s consumir o valor, informamos que a ponte est� desocupada
		ponteOcupada = false;
		notifyAll();
		return valor;
	}

}
