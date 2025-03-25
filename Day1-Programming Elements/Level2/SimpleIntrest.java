import java.util.Scanner; 
public class SimpleIntrest{
    public static void main(String[] args) {
        double principal,rate,time;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        principal=input.nextDouble();
        System.out.print("Enter rate: ");
        rate=input.nextDouble();
        System.out.print("Enter time: ");
        time=input.nextDouble();
        double intrest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+intrest+" for Principal "+principal+" Rate of Interest "+rate+" and Time "+time);
    }
}
