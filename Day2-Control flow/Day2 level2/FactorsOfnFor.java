import java.util.Scanner;
class factorsofnfor{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();

        if (num<0){
            System.out.println("Its a negative number");
        }else{
            for(int i=1;i<num;i++){
                if(num%i==0){
                    System.out.println(i);
                }else{
                    System.out.println("Not factor");
                }
            }
        }
    }
}
