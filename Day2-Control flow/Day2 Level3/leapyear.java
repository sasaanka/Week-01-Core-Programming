import java.util.Scanner;
class leapyear{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=inp.nextInt();

        if (year<1582){
            System.out.print("Leap year applies only after 1582");
        }else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
    }
}
}
