package aula93_94_95.threads;

/**
 * 
 * Threads - Third class (xti 95)
 * 
 * @author edneyroldao
 *
 */
public class Shopping implements Runnable{

	@Override
	public void run() {
		
		String nameThread = Thread.currentThread().getName();
		for(int i = 0; i < 7; i++) {
			
			conta.catchMoney(50, nameThread);
			if(conta.getSaldo() < 1) {
				System.out.println("you are crashed the bank");
			}
			
		}
		
	}
	
	ContaConjunta conta  = new ContaConjunta();
	
	public static void main(String[] args) {
		
		Shopping goingToShop = new Shopping();
		new Thread(goingToShop, "Father").start();
		new Thread(goingToShop, "Mother").start();
		new Thread(goingToShop, "oldestDaughter").start();
		new Thread(goingToShop, "newestDaughter").start();
		
	}

}
