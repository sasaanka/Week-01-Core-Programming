import java.util.Scanner;
class sumuntilzero{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double total=0.0;
        System.out.println("Enter numbers to add (Enter 0 to stop):");
        while(true){
            System.out.println("Enter a number: ");
            double num=input.nextDouble();
            if (num==0){
                break;
            }
            total+=num;
        }
        System.out.println("Total"+total);
    }
}
