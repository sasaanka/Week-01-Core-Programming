import java.util.Scanner;

public class TrignometryCal {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);  
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians); 
        
        return new double[]{sine, cosine, tangent}; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine(%.2f°) = %.5f%n", angle, result[0]);
        System.out.printf("Cosine(%.2f°) = %.5f%n", angle, result[1]);
        if (Math.abs(result[1]) < 1e-10) { 
            System.out.printf("Tangent(%.2f°) is undefined%n", angle);
        } else {
            System.out.printf("Tangent(%.2f°) = %.5f%n", angle, result[2]);
        }
    }
}
