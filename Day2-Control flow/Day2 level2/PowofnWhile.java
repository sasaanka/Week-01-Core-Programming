import java.util.Scanner;
class powofnwhile{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        int result = 1; 
        if (power < 0) {
            System.out.println("Power should be a non-negative integer.");
        } else {
            int counter = 0;
            while (counter < power) { 
                result *= num;
                counter++;
            }
            System.out.println(num + " raised to the power of " + power + " is: " + result);
        }
    }
}
