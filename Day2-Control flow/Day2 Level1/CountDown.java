import java.util.Scanner;
class countdown{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" Enter the counter: ");
        int counter=input.nextInt();
        while(counter>=1){
            System.out.println(counter);
            counter--;
        }
    }
}
