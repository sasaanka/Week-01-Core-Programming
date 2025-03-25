import java.util.Scanner;
public class FahrenheitToCelcius{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double tempinfahrenheit;
            System.out.print("Enter temperature in fahrenheit: ");
            tempinfahrenheit=input.nextDouble();
            double celsiusResult = (tempinfahrenheit -32) *5/9;
            System.out.println("The " + tempinfahrenheit+" fahrenheit in celsius is "+ celsiusResult);
        }
    }
}
