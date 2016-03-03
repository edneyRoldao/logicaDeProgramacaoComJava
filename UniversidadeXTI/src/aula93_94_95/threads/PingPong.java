package aula93_94_95.threads;

/**
 * Threads - First class (xti 93)
 * 
 * Every thread must to implement the Interface Runnable, it define a method runnable. 
 * 
 * One thread has four states:
 * 	1� start()
 *  2� run()
 *  3� sleep()
 *  4� stop()
 * 
 * @author edney.souza
 *
 */
public class PingPong extends Thread{
	
	String word;
	long time;
	// Constructor
	public PingPong(String word, long time) {
		this.word = word;
		this.time = time;
	}
	
	public static void main(String[] args) {
		
		// Every software in java has a thread behind, I'd to see using debug tools
		// in this case our thread maned main, its define by JVM behind
		//Let's create our first Thread, first we must extend the class, second we need to declare a constructor.
		
		//What does the thread bellow do ?
		//It going to print the words PING and PONG each other.
		new PingPong("PING", 1500).start(); //To start the thread, we need to invoke the method start()
		new PingPong("PONG", 3000).start(); 
		// These thread doesn't do nothing, because it doesn't have a run method implemented, How I can say above.
		// Notice: The JVM try to find the run method, after this, it run our thread
	}
	
	
	//Implementing run method
	//This method going to print these words five times, then it stop the run and sleep with method sleep() 
	@Override
	public void run() {
		try {
			for(int i =0; i < 5; i++) {
				System.out.print(word + " ");
					Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			return; // stop run of thread
		}
	}
	

}
