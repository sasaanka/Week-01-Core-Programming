import java.util.Scanner;
class illegalargumentexception {
    public static void generateException(String text, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index!");
        }
        System.out.println("The substring: " + text.substring(start, end));
    }
    public static void handleException(String text, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index!");
            }
            System.out.println("The substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = inp.nextLine();
        System.out.print("Enter the start index: ");
        int start = inp.nextInt();
        System.out.print("Enter the end index: ");
        int end = inp.nextInt();
        try {
            generateException(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("\nHandling IllegalArgumentException...");
        handleException(text, start, end);
    }
}
