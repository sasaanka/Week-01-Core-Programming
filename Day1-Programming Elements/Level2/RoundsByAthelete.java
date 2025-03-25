import java.util.Scanner;
public class RoundsByAthelete{
    public static void main(String[] args){
        int side1,side2,side3;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the side1: ");
        side1=input.nextInt();
        System.out.print("Enter the side2: ");
        side2=input.nextInt();
        System.out.print("Enter the side3: ");
        side3=input.nextInt();
        int perimeter=side1+side2+side3;
        int distance=5000;
        int totalrounds=distance/perimeter;
        System.out.println("The total number of rounds the athlete will run is " + totalrounds+" to complete 5 km");
    }
}
