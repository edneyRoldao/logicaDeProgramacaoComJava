package designPatterns.derekBanas.video03.strategy;

public class Bird extends Animal{
	
	public Bird() {
		super();
		setSound("Tweet");
		flyingType =  new ItFlys();
	}

}
