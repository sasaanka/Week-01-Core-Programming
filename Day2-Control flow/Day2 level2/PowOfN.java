import java.util.Scanner;
class powofn{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
        System.out.print("Enter the power: ");
        int power=input.nextInt();

        if(num<0){
            System.err.println("Its a negative number");
        }else{
            int result=1;
            for(int i=1;i<=power;i++){
                result*=num;
            }
            System.out.println(result);
        }
    }
}
