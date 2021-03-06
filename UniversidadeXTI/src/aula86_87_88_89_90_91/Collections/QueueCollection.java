package aula86_87_88_89_90_91.Collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author edneyroldao
 *
 *	A Interface Queue que e extende a Interface Collection tambem e implementada pela classe:
 *	 PriorityQueue
 *
 *	Utilizamos Queue para trabalhar com filas.
 *
 *	Ela segue o princio ** FIFO **
 *
 *	FIFO = first in first out
 *
 */
public class QueueCollection {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Tando o metodo add quando o offer adicionam o elemento no final da fila
		fila.add("Edney");
		fila.offer("Giselle");
		fila.add("Nadine");
		fila.offer("Marjorie");
		System.out.println(fila);
		
		//O metodo peek() informa que e o proximo da fila sem remove-lo
		System.out.println(fila.peek());
		
		//O metodo poll() apresenta o proximo da fila remove o mesmo em seguida
		System.out.println(fila.poll());
		System.out.println("Apresentado a fila apos usar o metodo poll: " + fila);
		
		/* OUTROS METODOS DISPONIVEIS SOMENTO PARA CLASSE LinkedList */
		//vamos criar um LinkedList a partir da lista de Queue acima, temos que fazer um cast
		LinkedList<String> f = (LinkedList<String>) fila;
		
		//Com o linkedList temos a possibilidade de adicionar elementos no inicio ou no final da fila
		f.addFirst("Caio");//Adicionando elemento no inicio
		f.addLast("Juliana");//Adicionando elemento no final
		System.out.println("Fila com likedList: " + f);
		
		//Temos tbm os metodos peekFirst e peekLast que retorna os elementos do inicio ou final da fila
		System.out.println("Retornando o elemento do inicio da fila: " + f.peekFirst());
		
		//Temos tbm os metodos peekFirst e peekLast que retorna os elementos do inicio ou final da fila
		System.out.println("Retornando o elemento do final da fila: " + f.peekLast());
		
		//Tbm temos os metodos que removem os elementos do final ou inicio da fila com pollFirst() e pollLast()
		System.out.println("remove o elemento no inicio da fila: " + f.pollFirst());
		System.out.println("remove o elemento no final da fila: " + f.pollLast());
		
		System.out.println("resultado final lista: " + f);
		
	}
	
}
