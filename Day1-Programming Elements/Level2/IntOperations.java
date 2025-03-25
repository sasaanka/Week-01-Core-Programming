import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value of a: ");
        a=input.nextInt();
        System.out.print("Enter the value of b: ");
        b=input.nextInt();
        System.out.print("Enter the value of c: ");
        c=input.nextInt();
        int result1=a+b*c;
        int result2=a*b+c;
        int result3=c+a/b;
        int result4=a%b+c;
        System.out.println("The results of int operations are "+result1+", "+result2+", "+result3+" and "+result4);
    }
}
