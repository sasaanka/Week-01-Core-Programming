import java.util.Scanner;
public class Smallndlarge{
    public static int[] smallestndLargest(int num1,int num2,int num3){
        int smallest=Math.min(num1,Math.min(num2,num3));
        int largest=Math.max(num1,Math.max(num2,num3));
        return new int[]{smallest,largest};
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1=inp.nextInt();
        System.out.print("Enter the number 2: ");
        int num2=inp.nextInt();
        System.out.print("Enter the number 3: ");
        int num3=inp.nextInt();
        int[] result=smallestndLargest(num1, num2, num3);
        System.out.println("Smallest: "+result[0]);
        System.out.println("Largest: "+result[1]);
    }
}
