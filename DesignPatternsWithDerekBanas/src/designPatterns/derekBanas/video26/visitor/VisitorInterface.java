package designPatterns.derekBanas.video26.visitor;

public interface VisitorInterface {

	public double visit(Liquor liquorItem);
	public double visit(Tabaco tabacoItem);
	public double visit(Necessario necessarioItem);
	
}
