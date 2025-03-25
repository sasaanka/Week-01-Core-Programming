import java.util.Scanner;
public class Sumofnloop{
    public static int sum(int n){
        int total=0;
        for (int i=0;i<=n;i++){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        System.out.println("Total is "+Sumofnloop.sum(num));
    }
}
