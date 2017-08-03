package JavaThread;
/**
 * 
 * @author Vishwas
 * 
 * In here creating a Runnable class by Implementing
 * than implementing run method to create a class
 * as mention in question
 *
 */
public class DaemonTest  implements Runnable{
	
	public void run() {
		/**
		 * In here using if-else statement 
		 * and also using Thread.currentThread() method which will returns a reference 
		 * to the currently executing thread object. 
		 */
		if (Thread.currentThread().isDaemon()) {
			System.out.println(" working thread is daemon thread  ");
		} else {
			System.out.println(" working thread is Second thread");
		}
		
	}
}

// creating a class HereDaemon  
class HereDaemon {
	//main method
	public static void main(String[] args) {
		System.out.println(" Showing thread is Printing....\n ");
		/**
		 * In here making two thread this class 
		 * as mention in question
		 */
		 Thread threadFirst= new Thread( new DaemonTest());
		 Thread threadSecond= new Thread(new DaemonTest());
		 /**
		  * in here making threadFirst object as 
		  * daemon as mention in question
		  */
		 threadFirst.setDaemon(true);
		
		 /**
		  * calling start method to create thread 
		  * which will call, run method automatically
		  */
		 threadFirst.start();
		 
		 threadSecond.start();
		}
}

