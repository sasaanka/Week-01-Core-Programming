import java.util.Scanner;
public class ChocoDistributor {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren; 
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates}; 
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
