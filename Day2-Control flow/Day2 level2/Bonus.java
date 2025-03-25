import java.util.Scanner;
class bonus{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter salary of an employee: ");
        int salary=input.nextInt();
        System.out.print("Enter years of service of an employee: ");
        int years=input.nextInt();
        if (years>5){
            int bonus=(5*salary)/100;
            System.out.println("Bonus "+ bonus);
        }       
    }
}
