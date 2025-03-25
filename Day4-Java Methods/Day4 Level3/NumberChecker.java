import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
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
    public static boolean isDuckNumber(int num) {
        return String.valueOf(num).contains("0");
    }
    public static boolean isArmstrongNumber(int num) {
        int[] digits = getDigitsArray(num);
        int power = digits.length;
        int sum = 0;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == num;
    }
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        
        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        
        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int num = 153; 
        System.out.println("Number of digits: " + countDigits(num));
        int[] digits = getDigitsArray(num);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Duck Number? " + (isDuckNumber(num) ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isArmstrongNumber(num) ? "Yes" : "No"));
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestValues[0]);
        System.out.println("Second largest digit: " + largestValues[1]);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestValues[0]);
        System.out.println("Second smallest digit: " + smallestValues[1]);
    }
}
