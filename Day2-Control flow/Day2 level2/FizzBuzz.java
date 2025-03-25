import java.util.Scanner;
class fizzbuzz{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number");
        int num=input.nextInt();
        if (num<0){
            System.out.println("The number is negative");
        }else{
            for(int i=1;i<=num;i++){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
