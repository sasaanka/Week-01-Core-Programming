import java.util.Scanner;
class oddeven{
    public static boolean isPos(int num){
        return num>=0;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static int compare(int num1,int num2){
        if (num1>num2){
            return 1;
        }else if(num1<num2){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] nums=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter the number "+(i+1)+" : ");
            nums[i]=inp.nextInt();
        }
        for(int num:nums){
            if(isPos(num)){
                System.out.println(num+" is a positive number and ");
                if (isEven(num)){
                    System.out.println(num+" is an even number ");
                }else{
                    System.out.println(num+" is an odd number ");
                }
            }else{
                System.out.println(num+ " is a negative number.");
            }
        }
        int result=compare(nums[0],nums[nums.length-1]);
        switch (result) {
            case 1 -> System.out.println("First number is greater than the last number ");
            case -1 -> System.out.println("First number is smaller than the last number ");
            default -> System.out.println("First number is equal to the last number ");
        }
    }
}
