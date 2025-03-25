import java.util.Scanner;
public class TotalPrice{
    public static void main(String[] args) {
        int unitprice,quantity;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter unit price of an item: ");
        unitprice=input.nextInt();
        System.out.print("Enter quantity of the item: ");
        quantity=input.nextInt();
        int totalprice=unitprice*quantity;
        System.out.println("The total purchase price is INR "+ totalprice+" if the quantity " + quantity+" and unit price is INR "+ unitprice);

    }
}
