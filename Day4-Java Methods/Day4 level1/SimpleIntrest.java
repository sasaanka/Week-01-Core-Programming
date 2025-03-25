import java.util.Scanner;
class SimpleIntrest{
    public static double calSimpleIntrest(double principal,double rate,double time){
        double intrest=(principal * rate * time) / 100;
        return intrest;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal=inp.nextDouble();
        System.out.print("Enter rate: ");
        double rate=inp.nextInt();
        System.out.print("Enter time: ");
        double time=inp.nextInt();
        double result= calSimpleIntrest(principal, rate, time);
        System.out.print("Simple Interest: " + result);
    }
}
