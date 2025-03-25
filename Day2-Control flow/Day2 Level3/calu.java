import java.util.Scanner;
class calu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        double num1 = input.nextDouble();
         System.out.print("Enter the number 2: ");
        double num2 = input.nextDouble();
System.out.print("Enter the operation (+, -, *, /): ");
        String op = input.next();
          double result = 0;
        boolean validOperation = true;
        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) { 
                    result = num1 / num2;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Invalid Operator! Please use +, -, *, or /.");
                validOperation = false;
            }
        }
        if (validOperation) {
                System.out.println("Result: " + num1 + " " + op + " " + num2 + " = " + result);
        }
    }
}
