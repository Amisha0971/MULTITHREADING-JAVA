package multithreading;

public class SleepExample {
	  public static void main(String[] args) {
	try {
        // Sleep for 1 second (1000 milliseconds)
        Thread.sleep(1000); 
        System.out.println("Slept for 1 second");
    } catch (InterruptedException e) {
        System.out.println("Thread was interrupted");
    }
}

}
