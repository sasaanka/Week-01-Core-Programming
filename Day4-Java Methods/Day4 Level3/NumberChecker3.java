import java.util.*;

public class NumberChecker3 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }
    public static int[] getDigitsArray(int num) {
        List<Integer> digitsList = new ArrayList<>();
        while (num > 0) {
            digitsList.add(num % 10);
            num /= 10;
        }
        int[] digits = new int[digitsList.size()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = digitsList.get(digitsList.size() - 1 - i);
        }
        return digits;
    }
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversedDigits = reverseArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int num = 1221; 
        System.out.println("Number of digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Palindrome? " + (isPalindrome(num) ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuckNumber(num) ? "Yes" : "No"));
    }
}
