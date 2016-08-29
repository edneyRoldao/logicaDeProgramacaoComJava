package lambdaExpression.model;

public class Person {

	// Attributes
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Default constructor
	public Person() {
	}

	// Static method used to compare age of person object
	public static int compareAges(Person p1, Person p2) {
		Integer age = p1.getAge();
		return age.compareTo(p2.getAge());
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
