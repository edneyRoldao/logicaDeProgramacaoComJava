package lambdaExpression.initialExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class UseComparatorWithLambda {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("ccc");
		strings.add("DDD");
		strings.add("CCC");
		strings.add("EEE");

		// Implementing comparator interface with lambda
		Comparator<String> comp = (s1,s2) -> {
			return s1.compareToIgnoreCase(s2);
		};
		
		System.out.println("Sort with comparator and lambda");

		// sorting list using comparator above
		Collections.sort(strings, comp);
		
		// we can make a looping with lambda also
		strings.forEach(str -> System.out.println(str));
		
		// The same approach above can be applied on iterator, look...
		Iterator<String> i = strings.iterator();
		System.out.println();
		System.out.println("Using iterator interface");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		
		
	}
	
}
