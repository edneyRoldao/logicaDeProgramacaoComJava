package lambdaExpression.tests;

import lambdaExpression.interfaces.SimpleInterface;

public class SimpleInterfaceTest {

	public static void main(String[] args) {
		
		SimpleInterface obj = () -> System.out.println("say something");
		obj.doSomething();
		
	}
	
}
