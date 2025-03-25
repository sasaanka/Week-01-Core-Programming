import java.util.Scanner;
class countthedigits{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number plzz: ");
        int num=input.nextInt();

        int count=0;
        if (num==0){
            count=1;
        }else{
            while(num!=0){
                num=num/10;
                count++;
            }
        }
        System.out.println("The number of digits are "+ count);
    }
}
