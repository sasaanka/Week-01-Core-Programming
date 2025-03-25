import java.util.Scanner;
public class QuoAndRem {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num1,num2;
            System.out.print("Enter the number 1: ");
            num1=input.nextInt();
            System.out.print("Enter the number 2: ");
            num2=input.nextInt();
            int quotient=num1/num2;
            int reminder=num1%num2;
            System.out.println(" The Quotient is "+quotient+" and Reminder is "+ reminder+" of two number "+num1+ " and "+num2);
        } 
    }
}
