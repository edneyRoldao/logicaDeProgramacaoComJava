package designPatterns.derekBanas.video03.strategy;

public class Dog extends Animal{
	
	public Dog() {
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}

	public void digHole() {
		System.out.println("Dug a hole!");
	}
	
	
	
	/*	@Override
		public void fly() {
			System.out.println("Can't fly");
		}
	*/	
}
