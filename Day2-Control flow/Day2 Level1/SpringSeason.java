import java.util.Scanner;
public class springseason {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the date (1-31): ");
        int date = input.nextInt();

        boolean isSpring = switch (month) {
            case 3 -> (date >= 20 && date <= 31);
            case 4 -> (date >= 1 && date <= 30);
            case 5 -> (date >= 1 && date <= 31);
            case 6 -> (date >= 1 && date <= 20);
            default -> false; 
        };
        System.out.println(isSpring ? "The season is Spring." : "It is not a Spring season.");

        }
    }
}
