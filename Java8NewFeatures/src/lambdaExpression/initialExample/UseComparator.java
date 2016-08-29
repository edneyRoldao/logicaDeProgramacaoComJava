package lambdaExpression.initialExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("ccc");
		strings.add("DDD");
		strings.add("CCC");
		strings.add("EEE");
		
		// Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
		for(String s : strings) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// Case-insensitive
		Collections.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});
		System.out.println("Sort with comparator");
		for(String s : strings) {
			System.out.println(s);
		}
		
		Collections.shuffle(strings);
		System.out.println();
		for(String s : strings) {
			System.out.println(s);
		}
		System.out.println();
		
		// Same code below with lambda
		Comparator<String> comp = (s1,s2) -> {
			return s1.compareToIgnoreCase(s2);
		};
		
		Collections.sort(strings, comp);
		System.out.println("Sort with comparator and lambda");
		for(String s : strings) {
			System.out.println(s);
		}
	}
	
}
