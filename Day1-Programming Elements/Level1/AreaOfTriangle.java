import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args) {
        int base,height;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter base of triangle in cm:");
        base=input.nextInt();
        input.nextLine();
        System.out.print("Enter height of triangle in cm:");
        height=input.nextInt();
        input.nextLine();
        double area=0.5*(double)base*(double)height;
        double areaInches = area / 6.4516;
        double totalInches = height / 2.54;
        @SuppressWarnings("unused")
        int feet = (int) (totalInches / 12);
        @SuppressWarnings("unused")
        double inches = totalInches % 12;
        System.out.println("The area of the triangle is " + area + " square centimeters and " + areaInches + " square inches.");        
    }
    }
