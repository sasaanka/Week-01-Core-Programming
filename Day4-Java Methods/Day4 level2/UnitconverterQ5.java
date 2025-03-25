import java.util.Scanner;
public class UnitconverterQ5{
    public static double convertYardstoFeet(double yards){
        return yards*3;
    }
    public static double convertFeettoYards(double feet){
        return feet*0.33333;
    }
    public static double convertMetertoInches(double meter){
        return meter*39.3701;
    }
    public static double convertInchestoMeter(double inches){
        return inches*0.0254;
    }
    public static double inchestocm(double Inches){
        return Inches*2.54;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter in yards: ");
        double yards=input.nextDouble();
        System.out.println("Yards in feet is "+ convertYardstoFeet(yards));
        System.out.print("Enter in feet: ");
        double feet=input.nextDouble();
        System.out.println("feet in Yards is "+ convertFeettoYards(feet));
        System.out.print("Enter in meters: ");
        double meter=input.nextDouble();
        System.out.println("Meter in inches is "+ convertMetertoInches(meter));
        System.out.print("Enter in inches: ");
        double inches=input.nextDouble();
        System.out.println("Inches in meter is "+convertInchestoMeter(inches));
        System.out.print("Enter in inches: ");
        double Inches=input.nextDouble();
        System.out.println(" Inches in cm "+ inchestocm(Inches));
    }
}
