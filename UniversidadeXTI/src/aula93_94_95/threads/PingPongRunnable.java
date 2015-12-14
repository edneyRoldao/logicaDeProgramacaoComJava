package aula93_94_95.threads;

/**
 * 
 * @author edneyroldao
 *
 * Threads - Second class (xti 94)
 * 
 * We might use Objects from Runnable Interface instead Threads
 *
 */
public class PingPongRunnable implements Runnable{
	
	String word;
	long intervalTime;
	
	public PingPongRunnable(String word, long intervalTime) {
		this.word = word;
		this.intervalTime = intervalTime;
	}

	// The most important thing when we work with Threads is the method run()
	@Override
	public void run() {
		try {
			for(int i =0; i < 5; i++) {
				System.out.print(word + " ");
					Thread.sleep(intervalTime);
			}
		} catch (InterruptedException e) {
			return; // stop run of thread
		}
	}

		
	
	public static void main(String[] args) {

		//Declaration Objects from Interface Runnable
		Runnable ping = new PingPongRunnable("PING", 1500);
		Runnable pong = new PingPongRunnable("PONG", 3000);
		
		//So now, we declare anonymous Thread class and inject Runnable object inside it
		//NOTICE: we can define at second argument a name for thread.
		//Again: we can see these threads working together running main method on debugging mode
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		//Now we have three threads: ping, pong and main

	}

}
