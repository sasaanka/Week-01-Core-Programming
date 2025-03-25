import java.util.Scanner;
class MulOfN6To9{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        
        int[] mul=new int[4];
        for (int i=6;i<=9;i++){
            mul[i-6]=num*i;
        }for (int i=6;i<=9;i++){
        System.out.println(num+" * "+ (i+6) +"= "+mul[i]);
        }
    }
}
