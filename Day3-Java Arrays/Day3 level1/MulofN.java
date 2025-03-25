import java.util.Scanner;
class mulofn{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
int[] ans=new int[10];
        for(int i=1;i<=10;i++){
            ans[i-1]=num*i;
        }
        for(int i=0;i<=10;i++){
            System.out.println(num+" * "+(i+1)+" = "+ans[i]);
        }
    }
}
