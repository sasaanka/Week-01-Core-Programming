import java.util.*;

public class NumberChecker5 {
    public static int[] findFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }
    public static int greatestFactor(int num) {
        int[] factors = findFactors(num);
        return factors[factors.length - 2];
    }
    public static int sumOfFactors(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long productOfFactors(int num) {
        long product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static long productOfCubesOfFactors(int num) {
        long product = 1;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor; 
        }
        return sum == num;
    }
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor;
        }
        return sum > num;
    }
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        int[] factors = findFactors(num);
        for (int factor : factors) {
            if (factor != num) sum += factor;
        }
        return sum < num;
    }
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 28; 
        int[] factors = findFactors(num);
        System.out.print("Factors of " + num + ": ");
        for (int factor : factors) System.out.print(factor + " ");
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(num));
        System.out.println("Sum of factors: " + sumOfFactors(num));
        System.out.println("Product of factors: " + productOfFactors(num));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(num));
        System.out.println("Is Perfect Number? " + (isPerfectNumber(num) ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (isAbundantNumber(num) ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (isDeficientNumber(num) ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (isStrongNumber(num) ? "Yes" : "No"));
    }
}
