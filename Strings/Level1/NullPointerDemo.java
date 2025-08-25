public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // Uncomment to see program crash
        // generateException();

        handleException();
    }
}
