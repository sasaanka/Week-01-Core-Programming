import java.util.Scanner;
class countdownfor{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the counter: ");
        int count=inp.nextInt();
        for (int i=count;i>=1;i--){
                System.out.println(i);
        }
    }
}
