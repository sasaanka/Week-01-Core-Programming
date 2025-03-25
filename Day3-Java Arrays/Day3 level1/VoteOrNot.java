import java.util.Scanner;
class voteornot{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter the age of the students "+(i+1)+": ");
            age[i]=inp.nextInt();
        }
        for(int i=0;i<  10;i++){
            if (age[i]<18){
            System.out.println("The student with age "+ age[i] +" cannot vote.");
        }else{
            System.out.println("The student with age "+ age[i] +" cann vote.");      
        }
        }
    }
}
