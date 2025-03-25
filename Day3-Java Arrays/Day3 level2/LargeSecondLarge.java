import java.util.Scanner;
class largesecondlarge{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=inp.nextInt();
        if(num<0){
            System.err.println("Error");
            System.exit(0);
        }
        int maxdigit=10;
        int[] digits=new int[maxdigit];
        
        int index=0;
        while(num!=0 && index<maxdigit){
            digits[index++]=num%10;
            num/=10;
        }
        if (index==0){
            System.out.println("NO digit found");
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for (int i=0;i<index;i++){
            if(digits[i]>largest){
                secondlargest=largest;
                largest=digits[i];
            }else if(digits[i]>secondlargest && digits[i]!=largest){
                secondlargest=digits[i];
            }
        }
        System.out.println("Digits stored in the array: ");
        for (int i=0;i<index;i++){
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + (secondlargest == Integer.MIN_VALUE ? "None" : secondlargest));
    }
}
