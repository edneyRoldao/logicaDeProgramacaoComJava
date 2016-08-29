package lambdaExpression.initialExample;

public class UseRunnabe {
	
	public static void main(String[] args) {
		
		//Thread 01
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running thread 1");
			}
		};
		
		// Thread 02
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running thread 2");
			}
		};
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		
	}

}
