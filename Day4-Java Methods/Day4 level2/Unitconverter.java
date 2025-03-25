import java.util.Scanner;
public class Unitconverter{
    public static double convertFarhenheitToCelsius(double farhenheit){
        return (farhenheit-32)*5/9;
    }
    public static double convertCelsiustoFarhenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundstoKg(double pounds){
        return pounds*0.453592;
    }
    public static double convertKgtoPounds(double kilos){
        return kilos*2.20462;
    }
    public static double convertGallonstoliters(double gallons){
        return gallons*3.78541;
    }
    public static double convertLiterstoGallons(double liters){
        return liters*0.264172; 
    }

    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter temp in farhenheit: ");
        double farhenheit=inp.nextDouble();
        System.out.println("The temperature in celsius is: "+convertFarhenheitToCelsius(farhenheit));
        System.out.print("Enter temp in Celsius: ");
        double celsius=inp.nextDouble();
        System.out.println("The temperature in celsius is: "+convertCelsiustoFarhenheit(celsius));        
        System.out.print("Enter the weight in pounds: ");
        double pounds=inp.nextDouble();
        System.out.println("The weight in kilo grams is: "+convertPoundstoKg( pounds));
        System.out.print("Enter the weight in kilos: ");
        double kilos=inp.nextDouble();
        System.out.println("The weight in pounds is "+convertKgtoPounds(kilos));
        System.out.print("Enter the amount of liquid in gallons: ");
        double gallons=inp.nextDouble();
        System.out.println("The amount of water in liters is "+convertGallonstoliters(gallons));
        System.out.print("Enter the amount of water in gallons: ");
        double liters=inp.nextDouble();
        System.out.println("The amount of liquid is "+ convertLiterstoGallons(liters));
}
}
