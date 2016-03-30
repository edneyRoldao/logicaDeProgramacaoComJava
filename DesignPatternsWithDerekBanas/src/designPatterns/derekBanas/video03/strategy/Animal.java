package designPatterns.derekBanas.video03.strategy;

/**
 * 
 * @author Edney Roldao
 *
 */
public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;
	
	/**
	 * This is a strategy pattern
	 */
	Flys flyingType;

	/**
	 * This is a strategy pattern
	 */
	public String tryToFly() {
		return flyingType.fly();
	}
	
	/**
	 * This is a strategy pattern
	 */
	public void setFlyingAbility(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	
	/**
	 * This method in this class doesn't correct.
	 * This is a bad code example.
	 */
	/*	public void fly() {
			System.out.println("I'm flying !!!");
		}
	*/	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("The weight must be bigger than zero");
		}
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
