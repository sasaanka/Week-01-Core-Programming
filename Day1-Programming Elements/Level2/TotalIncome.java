import java.util.Scanner;
public class TotalIncome{
    public static void main(String[] args){
        int salary,bonus;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the salary: ");
        salary=input.nextInt();
        System.out.print("Enter the bonus: ");
        bonus=input.nextInt();
        int totalincome=salary+bonus;
        System.out.println("The salary is INR "+salary+ " and bonus is INR "+bonus+". Hence the total income is INR "+totalincome);
    }
}
