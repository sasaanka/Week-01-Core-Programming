import java.util.Scanner;

public class DistanceTime{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.print("Enter your departure city: ");
            String fromCity = input.nextLine();
            System.out.print("Enter the via city: ");
            String viaCity = input.nextLine();
            System.out.print("Enter your destination city: ");
            String toCity = input.nextLine();
            System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
            double fromToVia = input.nextDouble();
            System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
            double viaToFinalCity = input.nextDouble();
            System.out.print("Enter the total travel time (in hours): ");
            double travelTime = input.nextDouble();
            double totalDistance = fromToVia + viaToFinalCity;
            System.out.println("Traveler Name: " + name);
            System.out.println("Journey: " + fromCity + " -> " + viaCity + " -> " + toCity);
            System.out.println("Total Distance: " + totalDistance + " miles");
            System.out.println("Total Time Taken: " + travelTime + " hours");
        }
    }
}
