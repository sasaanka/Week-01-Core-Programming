import java.util.Scanner;
class fizzbuzz{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=inp.nextInt();

        if (num<0){
            System.out.println("Its a negative number");
        }
        String[] result=new String[num+1];
        for(int i=0;i<=num;i++){
            if (i%3==0 && i%5==0){
                result[i]="FizzBuzz";
            }else if(i%3==0){
                result[i]="Fizz";
            }else if(i%5==0){
                result[i]="Buzz";
            }else{
                result[i]=String.valueOf(i);
            }
        }
        
        for(int i=0;i<=num;i++){
            System.out.println(result[i]);
        }
    }
}
