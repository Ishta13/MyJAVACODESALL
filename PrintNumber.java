public class PrintNumber {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Just print the number
        }
    }

    public static void main(String[] args) {
        PrintNumbers thread = new PrintNumbers(); // Create thread object
        thread.start(); // Start the thread
    }
}
