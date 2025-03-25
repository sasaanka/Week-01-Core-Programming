import java.util.Scanner;
class voteornot{
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("Enter the age of a person: ");
        int age=num.nextInt();
        if (age>18){
            System.out.println("The persons age is "+age+" and can vote");
        }else{
            System.out.println("The persons age is "+age+" and cannot vote");
        }

    }
}
