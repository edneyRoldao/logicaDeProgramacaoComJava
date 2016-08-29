package lambdaExpression.methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lambdaExpression.model.Person;

public class StaticMethodReference {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Edney", 34));
		people.add(new Person("Giselle", 28));
		people.add(new Person("Nadine", 13));
		people.add(new Person("Marjorie", 1));

		Collections.sort(people, Person :: compareAges);
		people.forEach(p -> System.out.println(p));

	}

}
