import java.util.Scanner;
class factusingfor{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        if (num<0){
            System.out.print("its a neagtive number");
        }else{
            int total=1;       
        for(int i=num;i>0;i--){
            total*=i;
        }
        System.out.println("Factorial is "+total);
        }
    }
}
