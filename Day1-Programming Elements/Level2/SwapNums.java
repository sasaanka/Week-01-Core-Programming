import java.util.Scanner;
public class SwapNums{
    public static void main(String[] args) {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        num1=input.nextInt();
        System.out.print("Enter the number2: ");
        num2=input.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swapped numbers are "+ num1 + " and " + num2);
    }}
