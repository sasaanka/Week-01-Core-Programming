import java.util.Scanner;
class UnitConverterQ4{
    public static double convertKmtoMiles(double km){
        return km*0.6217;
    }
    public static double convertmilestoKm(double miles){
        return miles*1.60;
    }
    public static double convertmetertofeet(double meter){
        return meter*3.28;
    }
    public static double convertfeettometer(double feet){
        return feet*0.3048;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter kilometers to convert : ");
        double kilo=input.nextDouble();
        System.out.println("Kilometers in miles is "+convertKmtoMiles(kilo));
        System.out.print("Enter Miles to convert : ");
        double miles=input.nextDouble();
        System.out.println("Miles in Kilometers  is "+convertmilestoKm(miles));
        System.out.print("Enter meters to convert : ");
        double meter=input.nextDouble();
        System.out.println("Meters in feet is "+convertmetertofeet(meter));
        System.out.print("Enter feet to convert : ");
        double feet=input.nextDouble();
        System.out.println("Feet in meter is "+convertfeettometer(feet));

    }
}
