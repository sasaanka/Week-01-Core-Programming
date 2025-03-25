import java.util.Scanner;
class suminarray{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double[] nums=new double[10];
        double total=0.0;
        int index=0;
        while(true){
            System.out.print("Enter a number: ");
            double num=inp.nextDouble();
            if (num<=0){
                break;
            }
            nums[index]=num;
            index++;
            if (index==10){
                break;
            }
        }
        System.out.println("Numbers entered ");
        for (int i=0;i<index;i++){
                System.out.println(nums[i]+" ");
                total+=nums[i];
        }
        System.out.println("Total sum : "+total);
    }
}
