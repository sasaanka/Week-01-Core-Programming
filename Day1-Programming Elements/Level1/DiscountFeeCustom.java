import java.util.Scanner;
public class DiscountFeeCustom{
    public static void main(String[] args) {
        double fee, discountpercent;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter fee:");
        fee= input.nextDouble();
        input.nextLine();
        System.out.print("Enter Discount percent:");
        discountpercent= input.nextDouble();
        input.nextLine();
        double discount = (fee*discountpercent)/100;
        double discountamt= fee-discount;
        System.out.println("The discount amount is INR "+ discount + " and the discounted fee is INR "+ discountamt);       
    }
}
