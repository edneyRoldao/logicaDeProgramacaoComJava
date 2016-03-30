package designPatterns.derekBanas.video03.strategy;

public class CantFly implements Flys {

	@Override
	public String fly() {
		return "I can't fly !";
	}

}
