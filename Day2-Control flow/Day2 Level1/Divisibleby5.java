import java.util.Scanner;
class divisibleby5{
    public static void main(String[] args){
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        number=input.nextInt();
        if (number%5==0){
            System.out.println("Is the number "+ number+" divisible by 5: "+ true);
        }else{
            System.out.println("Is the number "+ number+" divisible by 5: "+ false);
        }
    }
}
