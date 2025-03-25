import java.util.Scanner;
class armstrongornot{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number plzz: ");
        int num=input.nextInt();
        int sum=0;
        int originalnum=num;
        while(originalnum!=0){
            int digit=originalnum%10;
            sum += digit*digit*digit;
            originalnum/=10;
        }
        if (sum==num){
            System.out.println("Its an armstrong number");
        }else{
            System.out.println("Its not an armstrong number");
        }
    }
}
