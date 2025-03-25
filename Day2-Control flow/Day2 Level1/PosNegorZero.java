import java.util.Scanner;
class posnegorzero{
    public static void main(String[] args){
        int num;
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=inp.nextInt();
        if (num>0){
            System.out.println("Positive");
        }else if (num<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
