import java.util.Scanner;
public class DoubleOperations {
    public static void mQ3l2ain(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of a: ");
        a=input.nextDouble();
        System.out.print("Enter the value of b: ");
        b=input.nextDouble();
        System.out.print("Enter the value of c: ");
        c=input.nextDouble();
        double result1=a+b*c;
        double result2=a*b+c;
        double result3=c+a/b;
        double result4=a%b+c;
        System.out.println("The results of double operations are "+result1+", "+result2+", "+result3+" and "+result4);
    }
}
