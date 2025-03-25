import java.util.Scanner;
class largestofthree{
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1=input.nextInt();
        System.out.print("Enter number 2: ");
        num2=input.nextInt();
        System.out.print("Enter number 3: ");
        num3=input.nextInt();
        System.out.println("Is the first number the largest? " + (num1>num2 && num1>num3));
        System.out.println("Is the second number the largest? " + (num2>num1 && num2>num3));
        System.out.println("Is the third number the largest? " + (num3>num1 && num3>num1));

    }
}
