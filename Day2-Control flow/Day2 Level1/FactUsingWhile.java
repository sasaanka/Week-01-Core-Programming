import java.util.Scanner;
class factusingwhile{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();

        if (num<0){
            System.out.println("Its a negative number");
        }else{
            int total=1;
            int i=num;
        while(i>0){
            total*=i;
            i--;
            
        }
        System.out.println("Factorial is "+ total);
         }
        
    }
}
