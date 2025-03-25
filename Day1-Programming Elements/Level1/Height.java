import java.util.Scanner;
public class Height{
    public static void main(String[] args) {
        int heightincm;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter height in centimeters ");
            heightincm=input.nextInt();
            input.nextLine();
            //1foot=12 inches and 1inch =2.54cm
            double totalinches=heightincm/2.54;
            int feet= (int)totalinches/12;
            double inches=totalinches%12;
            System.out.println("Your Height in cm is " + heightincm +  " while in feet is " + feet + " and inches is " + inches);
        }
    }
}
