import java.util.Scanner;
class Maxhandshakes{
    public static int possible(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=inp.nextInt();
        int result=Maxhandshakes.possible(n);
        System.out.println("The possible handshakes are: "+result);
    }
}
