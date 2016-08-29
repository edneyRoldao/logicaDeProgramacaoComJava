package lambdaExpression.initialExample;

public class UseRunnabeWithLambda {
	
	public static void main(String[] args) {
		
		//Thread 01 e 02
		Runnable r1 = () -> System.out.println("Running thread 1");
		Runnable r2 = () -> System.out.println("Running thread 2");
		
		Runnable r3 = () -> {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Running thread 3");
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
		
	}

}
