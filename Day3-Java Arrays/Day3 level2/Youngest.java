import java.util.Scanner;
class Youngest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] frnds = {"Amar", "Akbar", "Antony"};
        int[] age = new int[3];
        int[] height = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for " + frnds[i] + ":");
            while (true) {
                System.out.print("Enter age: ");
                age[i] = input.nextInt();
                if (age[i] > 0) {
                    break; 
                }
                System.err.println("Invalid! Age must be positive.");
            }
            while (true) {
                System.out.print("Enter height (in cm): ");
                height[i] = input.nextInt();
                if (height[i] > 0) {
                    break; 
                }
                System.err.println("Invalid! Height must be positive.");
            }
        }
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("The youngest friend is: " + frnds[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("The tallest friend is: " + frnds[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");

    }
}
