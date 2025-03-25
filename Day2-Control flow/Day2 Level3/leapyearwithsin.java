import java.util.Scanner;
class leapyearwithsin{
    public static void main(String[] args){
    Scanner inp=new Scanner(System.in);
    System.out.print("Enter the year: ");
    int year=inp.nextInt();
    if (year<1582){
        System.out.println("Year must be above 1582");
    }else{
        if ((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+"is a leap year");
        }else{
            System.out.println(year+ " is not a leap year");
        }
    }
    }
}
