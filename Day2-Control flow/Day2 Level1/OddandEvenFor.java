import java.util.Scanner;
class oddandevenfor{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
  if (num<0){
            System.out.println("Its a negative number");
        }else{
            for(int i=1;i<=num;i++){
                if (i%2==0){
                    System.out.println(i + " is even");
                }else{
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}
