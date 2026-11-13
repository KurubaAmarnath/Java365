public class ThrowsKeyword {
    // Declaring an exception using throws
    public static void waitForProcess() throws InterruptedException {
        System.out.println("Process Started");
        Thread.sleep(2000);
        System.out.println("Process Completed");
    }
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try {
            waitForProcess();
        }
        catch (InterruptedException e) {
            System.out.println("Process Interrupted");
        }
        System.out.println("Main Method Completed");
    }
}