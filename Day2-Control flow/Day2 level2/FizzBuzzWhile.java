import java.util.Scanner;
class fizzbuzzwhile{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        
        if (num<0){
            System.out.println("its a neagtive number");
        }else{
            int i = 1; // Start from 1
            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++; 
            }
        }
    }
}
