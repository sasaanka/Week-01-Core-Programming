import java.util.Scanner;
class Primeornot{
    public static int prime(int num){
        if (num<0){
            return -1;
        }else if(num>0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        System.out.println("The number is "+Primeornot.prime(num));
    }
}
