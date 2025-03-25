import java.util.*;
public class NumberChecker2 {
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
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int num) {
        int[] digits = getDigitsArray(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }
    public static int[][] findDigitFrequency(int num) {
        int[] count = new int[10]; 
        
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        int size = 0;
        for (int freq : count) {
            if (freq > 0) size++;
        }

        int[][] freqArray = new int[size][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                freqArray[index][0] = i;
                freqArray[index][1] = count[i];
                index++;
            }
        }
        return freqArray;
    }

    public static void main(String[] args) {
        int num = 156; 
        System.out.println("Number of digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number? " + (isHarshadNumber(num) ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
        int[][] freqArray = findDigitFrequency(num);
        for (int[] row : freqArray) {
            System.out.println("Digit " + row[0] + ": " + row[1] + " times");
        }
    }
}
