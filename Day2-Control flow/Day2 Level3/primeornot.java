import java.util.Scanner;

class primeornot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean isprime=true;
        if (num<=1){
            //System.out.println("Enter positive number");
             isprime=false;
        }else{
            for(int i =2;i<=Math.sqrt(num);i++){
                if (num%i==0){
                     isprime=false;
                }
            }
        }
        if (isprime){
            System.out.println("Its a prime number");
        }else{
            System.out.println("Its not a prime number");
        }
    }
}
