package lambdaExpression.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lambdaExpression.model.Person;

public class PredicateInnerClass {

	public static void main(String[] args) {

		List<Person> p = new ArrayList<>();
		p.add(new Person("Edney", 34));
		p.add(new Person("Giselle", 28));
		p.add(new Person("Nadine", 13));
		p.add(new Person("Marjorie", 1));

		Predicate<Person> pred = new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return (p.getAge() > 17);
			}
		};

		for (Person person : p) {
			if (pred.test(person)) {
				System.out.println(person.toString());
			}
		}

	}

}
