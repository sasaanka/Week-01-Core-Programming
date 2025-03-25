import java.util.Scanner;
class smallofthree{
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        num1=input.nextInt();
        System.out.print("Enter the number 2: ");
        num2=input.nextInt();
        System.out.print("Enter the number 3: ");
        num3=input.nextInt();
        if (num1>num2){
            System.out.println("Is the number 1 smallest? " +false);
        }else if(num1>num3){
            System.out.println("Is the number 1 smallest? "+ false);
        }else if(num1<num2 && num1<num3){
             System.out.println("Is the number 1 smallest? " +true);
        }
    }
}
