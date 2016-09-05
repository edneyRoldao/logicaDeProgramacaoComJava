package collectionIteratable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparableInterface {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Marjorie", 0));
		list.add(new Person("Edney", 34));
		list.add(new Person("Nadine", 13));
		list.add(new Person("Giselle", 28));
		
		Collections.sort(list);
		
		for(Person p : list) {
			System.out.println(p.getName());
		}

	}
	

}
