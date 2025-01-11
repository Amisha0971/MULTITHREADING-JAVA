package multithreading;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyThread
        MyThreadExample thread = new MyThreadExample();

        // Starting the thread
        thread.start();  // This calls the run() method in the MyThread class
        
        //Creating an instance of My Runnable
        MyRunnableExample runnable = new MyRunnableExample();
        
        runnable.run(); // This calls the run() method in the MyRunnable class
    }
}


