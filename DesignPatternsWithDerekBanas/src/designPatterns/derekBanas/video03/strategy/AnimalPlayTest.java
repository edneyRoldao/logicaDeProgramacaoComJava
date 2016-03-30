package designPatterns.derekBanas.video03.strategy;

public class AnimalPlayTest {
	
	public static void main(String[] args) {
		
		Animal thor = new Dog();
		Animal passaro = new Bird();
		
		System.out.println("Dog: " + thor.tryToFly());
		System.out.println("Bird: " + passaro.tryToFly());
		System.out.println();
		
		Animal specialDog = new Dog();
		specialDog.setFlyingAbility(new ItFlys());
		System.out.println("This new special dog can fly: " + specialDog.tryToFly());
		
	}

}
