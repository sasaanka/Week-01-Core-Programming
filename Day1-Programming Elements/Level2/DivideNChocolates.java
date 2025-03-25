import java.util.Scanner;
public class DivideNChocolates{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the total number of chocolates: ");
            int numberOfChocolates = input.nextInt();
            
            System.out.print("Enter the total number of children: ");
            int numberOfChildren = input.nextInt();
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;
            int remainingChocolates = numberOfChocolates % numberOfChildren;
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
        } 
    }
}
