package lambdaExpression.methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lambdaExpression.model.Person;

public class InstanceMethodReference {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Edney", 34));
		people.add(new Person("Giselle", 28));
		people.add(new Person("Nadine", 13));
		people.add(new Person("Marjorie", 1));

		InstanceMethodReference thisClassObj = new InstanceMethodReference();
		thisClassObj.sortData(people);

	}
	
	public void sortData(List<Person> people) {
		Collections.sort(people, this :: compareAges);
		people.forEach(p -> System.out.println(p));
	}
	
	public int compareAges(Person p1, Person p2) {
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}

}
