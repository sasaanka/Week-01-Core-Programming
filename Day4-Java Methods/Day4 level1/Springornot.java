import java.util.Scanner;
public class Springornot{
    public static boolean Spring(int date,int month){
        if (date>20 &&date<31 && month==3){
            return true;
        }else if(date>0 && date<31 && month==4){
            return true;
        }else if(date>0 && date<31 && month==5){
            return true;
        }else return date>0 && date<20 && month==6;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the date(1-31): ");
        int date=inp.nextInt();
        System.out.print("Enter the month(1-12): ");
        int month=inp.nextInt();
        boolean result=Springornot.Spring(date, month);
        if (result){
            System.out.println("It's a spring season");
        }else{
            System.out.println("Its not a spring season");
        }
    }
}
