import java.util.Scanner;
public class DistanceInYardsMiles{
    public static void main(String[] args) {
        double distanceinfeet;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter distance in feet:");
        distanceinfeet=input.nextDouble();
        double distanceInYards = distanceinfeet / 3;  
        double distanceInMiles = distanceInYards / 1760; 
        System.out.println("The distance in yards and miles is "+ distanceInYards +", "+distanceInMiles+" while distance in feet is "+distanceinfeet);
    }
}
