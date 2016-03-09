package collectionIteratable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Esta e uma das interfaces de Collections utilizada para iterar objetos
 * @author Edney Roldao
 *
 */
public class FirstExampleIterator {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ola");
		list.add("tutorial");
		list.add("iterator");
		list.add("com");
		list.add("java");
		
		Iterator<String> it = list.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
	}

}
