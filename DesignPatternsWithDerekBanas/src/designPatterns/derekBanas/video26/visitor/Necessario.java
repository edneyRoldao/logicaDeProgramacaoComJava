package designPatterns.derekBanas.video26.visitor;

public class Necessario implements VisitableInterface {

	private double price;
	
	public Necessario(double price) {
		this.price = price;	
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(VisitorInterface visitor) {
		return visitor.visit(this);
	}
	
}
