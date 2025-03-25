import java.util.Scanner;
public class PoundsToKg {
    public static void main(String[] args) {
        double weightinpounds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        weightinpounds=input.nextDouble();
        double kilograms=weightinpounds/2.2;
        System.out.println("The weight of the person in pound is "+ weightinpounds+"and in kg is "+kilograms);        
    }
}
