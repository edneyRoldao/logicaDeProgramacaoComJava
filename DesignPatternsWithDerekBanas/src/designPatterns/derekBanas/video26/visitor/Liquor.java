package designPatterns.derekBanas.video26.visitor;

public class Liquor implements VisitableInterface {

	private double price;
	
	public Liquor(double price) {
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
