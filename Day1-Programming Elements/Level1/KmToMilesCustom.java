import java.util.Scanner;
public class KmToMilesCustom{
    public static void main(String[] args){
        double km,miles;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers:");
            km=input.nextDouble();
            miles= km/1.6;
            System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
        }

    }
}
