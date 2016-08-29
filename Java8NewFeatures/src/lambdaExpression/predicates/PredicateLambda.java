package lambdaExpression.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lambdaExpression.model.Person;

/**
 * In this class I'm using lambda expressions to replace innerClass and classic
 * forEach
 * 
 * @author Edney
 *
 */
public class PredicateLambda {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Edney", 34));
		people.add(new Person("Giselle", 28));
		people.add(new Person("Nadine", 13));
		people.add(new Person("Marjorie", 1));

		Predicate<Person> predAdult = (p) -> p.getAge() > 17;
		Predicate<Person> predChild = (p) -> p.getAge() < 18;

		displayPerson(people, predAdult);
		displayPerson(people, predChild);

	}

	private static void displayPerson(List<Person> people, Predicate<Person> pred) {
		people.forEach(p -> {
			if (pred.test(p))
				System.out.println(p);
		});
	}

}
