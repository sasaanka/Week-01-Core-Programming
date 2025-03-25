import java.util.Scanner;
class posneg{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] num=new int[5];
        for (int i=0;i<5;i++){
            System.out.print("Enter the  number"+ (i+1)+": ");
            num[i]=inp.nextInt();
        }
        for (int i=0;i<5;i++){
            if(num[i]<0){
                System.out.println("Negative");
            }else if(num[i]>0){
                
                if (num[i]%2==0){
                    System.out.println("Positive, The number is even");
                }else{
                    System.out.println("Positive, The number is odd");
                }
            }else{
                System.out.println("Zero");
            }
        }
            if (num[0]>num[4]){
                System.out.println("first element is greater than the last element");
            }else if(num[0]<num[4]){
                System.out.println("first element is smaller than the last element");   
            }else{
                System.out.println("first element is equal to the last element");
            }
        
    }
}
