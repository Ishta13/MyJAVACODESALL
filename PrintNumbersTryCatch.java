public class PrintNumbersTryCatch extends Thread {
    public void run() {
        // This code runs when the thread is started
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to slow down the output
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbers thread = new PrintNumbers(); // Create a thread object
        thread.start(); // Start the thread, which runs the run() method
    }
}
