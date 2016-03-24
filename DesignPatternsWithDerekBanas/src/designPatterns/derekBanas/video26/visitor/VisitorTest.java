package designPatterns.derekBanas.video26.visitor;

public class VisitorTest {

	public static void main(String[] args) {
		
		ImpostoVisitor calcImposto = new ImpostoVisitor();
		TaxHolidayVisitor calcHoliday = new TaxHolidayVisitor();
		
		Necessario leite = new Necessario(2.78);
		Liquor vodka = new Liquor(78.46);
		Tabaco cigarro = new Tabaco(12.36);
		
		System.out.println(leite.accept(calcImposto) + "\n");
		System.out.println(vodka.accept(calcImposto) + "\n");
		System.out.println(cigarro.accept(calcImposto) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES \n");
		System.out.println(leite.accept(calcHoliday) + "\n");
		System.out.println(vodka.accept(calcHoliday) + "\n");
		System.out.println(cigarro.accept(calcHoliday) + "\n");
		
	}
	
}
