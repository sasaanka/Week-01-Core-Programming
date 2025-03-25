import java.util.Scanner;
public class BasicCalu{
    public static void main(String[] args){
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1=input.nextInt();
        input.nextLine();
        System.out.print("Enter number 2: ");
        num2=input.nextInt();
        input.nextLine();
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 number " + add+" and "+sub+" and "+ mul +" and "+  div);

    }
}
