import java.util.Scanner;
class sumofn{
    public static int sumrecursion(int num){
        if (num==1){
            return 1;
        }else{
            return num+sumrecursion(num-1);
        }
    }
    public static int sumformula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        if (num<=0){
            System.out.println("Enter a natural number");
            return;
        }
        int recursivesum=sumrecursion(num);
        int formulasum=sumformula(num);
        System.out.println("The sum using recursion: "+recursivesum);
        System.out.println("The sum using formula : "+formulasum);
        if (recursivesum==formulasum){
            System.out.println("Both sums are equal");
        }else{
            System.out.println("Both are different");
        }
    }
}
