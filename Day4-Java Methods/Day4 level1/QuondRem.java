import java.util.Scanner;
public class QuondRem{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder=number%divisor;
        int quotient = number / divisor; 
        return new int[]{remainder,quotient};
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=inp.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor=inp.nextInt();
        int[] result=findRemainderAndQuotient(number, divisor);
        System.out.println("The remainder is: "+result[0]);
        System.out.println("The quotient is: "+result[1]);
    }
}
