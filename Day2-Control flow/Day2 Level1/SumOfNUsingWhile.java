import java.util.Scanner;
class sumofnusingwhile{
    public static void main(String[] args){
        int num;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter number: ");
        num=inp.nextInt();
        if (num>0){
        int result1=(num*(num+1)/2);  
        int sumwhile=0,i=1;
        while(i<=num){
            sumwhile+=i;
            i++;
        }
        if (result1==sumwhile){
            System.out.println("Both are same");
        }else {
                System.out.println(" There's an error in computation!");
            }
        inp.close();
    }
}
}
