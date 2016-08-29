package lambdaExpression.tests;

import lambdaExpression.interfaces.SimpleInterfaceWithArgs;

public class SimpleInterfaceWithArgsTest {

	public static void main(String[] args) {
		
		SimpleInterfaceWithArgs obj = (a, b) -> {
			int r = a + b;
			System.out.println("The result is: " + r);
		};
		obj.doSomething(10, 20);
	}
	
}
