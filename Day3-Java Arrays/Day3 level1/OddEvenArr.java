import java.util.Scanner;
class oddevenarr{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=inp.nextInt();
        if(num<0){
            System.err.println("Error");
            System.exit(0);
        }
        int[] evenarray=new int[num/2];
        int[] oddarray=new int[(num+1)/2];
        int indexodd=0;
        int indexeven=0;
        for(int i=0;i<num;i++){
            if (i%2==0){
                evenarray[indexeven++]=i;
            }else{
                oddarray[indexodd++]=i;
            }
        }
        System.out.println("Even number");
        for(int i=0;i<indexeven;i++){
            System.out.println(evenarray[i]);
        }
        System.out.println("Odd number");
        for(int i=0;i<indexodd;i++){
            System.out.println(oddarray[i]);
    }
}
}
