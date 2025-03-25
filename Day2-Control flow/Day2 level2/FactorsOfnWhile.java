import java.util.Scanner;
class factorsofnwhile{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();

        if (num<0){
            System.out.println("Its a negative number");
        }else{
            int counter=1;
            while(counter<=num){
                if (num%counter==0){
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }
}
