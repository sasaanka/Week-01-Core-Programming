import java.util.Scanner;
class sumusingfor{
    public static void main(String[] args){
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num=input.nextInt();
        if(num>0){
            System.out.print("The number is a natural number");
            int result=(num*(num+1)/2);
            int loopsum=0;
            for(int i=1;i<=num;i++){
                loopsum+=i;
            }
            System.out.println("Sum using formula: " + result);
            System.out.println("Sum using for loop: " + loopsum);

            if (result == loopsum) {
                System.out.println("Both computations match!");
            } else {
                System.out.println(" There's an error in computation!");
            }
        } else {
            System.out.println("The number " + num + " is not a natural number.");
        }

        }
}
