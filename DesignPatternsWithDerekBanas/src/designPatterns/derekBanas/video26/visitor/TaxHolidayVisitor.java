package designPatterns.derekBanas.video26.visitor;

import java.text.DecimalFormat;

public class TaxHolidayVisitor implements VisitorInterface {

	DecimalFormat df = new DecimalFormat("#,##");

	public TaxHolidayVisitor() {

	}

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("Liquor item: Valor do imposto");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tabaco tabacoItem) {
		System.out.println("Tabaco item: Valor do imposto");
		return Double.parseDouble(df.format((tabacoItem.getPrice() * .32) + tabacoItem.getPrice()));
	}

	@Override
	public double visit(Necessario necessarioItem) {
		System.out.println("Necessario item: Valor do imposto");
		return Double.parseDouble(df.format((necessarioItem.getPrice() * .0) + necessarioItem.getPrice()));
	}

}
