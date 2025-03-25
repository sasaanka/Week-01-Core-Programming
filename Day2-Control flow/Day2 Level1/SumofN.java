import java.util.Scanner;
class sumofn{
    public static void main(String[] args) {
        Scanner chuma=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=chuma.nextInt();
        if (num>1){
            int result=(num*(num+1))/2;
            System.out.println("The sum of "+num+" is "+result);
        }else{
            System.out.println("The num "+ num +" is not a natural number");
        }
    }
}
