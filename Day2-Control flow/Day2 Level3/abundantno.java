import java.util.Scanner;
class abundantno{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if (num%i==0){
                sum+=i;

            }
        }
        if(sum>num){
            System.out.println("Abundant number");
        }else{
            System.out.println("Not abundant number");
        }
        
    }
}
