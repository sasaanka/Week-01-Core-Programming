import java.util.Random;
import java.util.Scanner;
class Voteornot {
    public static int[] randomGenerate(int n) {
        Random ran = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = ran.nextInt(90) + 10; 
        }
        return ages;
    }
    public static String[][] voteEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); 
            if (ages[i] >= 18) {
                result[i][1] = "True"; 
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.println("\nStudent Age    Can Vote?");
        for (String[] row : table) {
            System.out.printf("%-12s %-5s\n", row[0], row[1]); 
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = inp.nextInt();
        int[] ages = randomGenerate(n);
        String[][] votingResults = voteEligibility(ages);
        displayTable(votingResults);
    }
}
