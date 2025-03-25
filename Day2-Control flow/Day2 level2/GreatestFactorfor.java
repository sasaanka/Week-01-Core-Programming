import java.util.Scanner;
class greatestfactorfor{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        int greatestfactor =1;
        for(int i=num-1;i>0;i--){
            if (num%i==0){
                greatestfactor=i;
                break;
            }
        }
        System.out.println("Greatest factor of " + num + " is: " + greatestfactor);
    }
}
