import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double tempincelsius;
            System.out.print("Enter temperature in celsius: ");
            tempincelsius=input.nextDouble();
            double fahrenheitResult = (tempincelsius * 9 / 5) + 32;
            System.out.println("The " + tempincelsius+" celsius in fahrenheit is "+ fahrenheitResult);
        }
    }
}
