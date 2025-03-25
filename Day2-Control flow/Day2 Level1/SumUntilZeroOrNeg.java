import java.util.Scanner;
class sumuntilzeroorneg{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double total=0.0;
        System.out.println("Enter numbers to be added(Enter 0 or negative num to stop): ");
        while (true) { 
            System.out.print("Enter number to add: ");
            double num=input.nextDouble();
            if (num<=0){
                break;
            }
            total+=num;
        }
        System.out.println("Total "+ total);
        }
}
