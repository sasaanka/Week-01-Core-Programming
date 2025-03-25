import java.util.Scanner;
public class PalindromeCheck {
    public static boolean isPalindromeUsingLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseCharArray(text);
        
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }
    public static char[] reverseCharArray(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check for palindrome: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-z0-9]", ""); 

        System.out.println("\n--- Palindrome Check ---");

        boolean result1 = isPalindromeUsingLoop(input);
        System.out.println("Using Loop: " + (result1 ? "Palindrome" : "Not a Palindrome"));

        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        System.out.println("Using Recursion: " + (result2 ? "Palindrome" : "Not a Palindrome"));

        boolean result3 = isPalindromeUsingCharArray(input);
        System.out.println("Using Char Array: " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}
