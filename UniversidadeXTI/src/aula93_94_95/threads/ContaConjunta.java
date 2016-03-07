package aula93_94_95.threads;

/**
 * Threads - Third class (xti 95)
 * 
 * @author edneyroldao
 *
 */
public class ContaConjunta {
	
	double saldo = 1000.00;
	
	public double getSaldo() {
		return saldo;
	}
	
	//The modify synchronized is used to avoid that more than one thread access method at the same time. 
	public synchronized void catchMoney(double value, String client) {
		
		if(saldo >= value) {
			System.out.println(client + "is catching money - value: " + value);
			
			try {
				//Client waiting process
				System.out.println(client + " wait process");
				Thread.sleep(1000);//processing
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			saldo -= value;
			System.out.println("Process ok !" + client + " got the money, now your account has:" + saldo);
		}else {
			System.out.println(client + "you don't have this value in your account. Sorry");
		}
		
	}

}
