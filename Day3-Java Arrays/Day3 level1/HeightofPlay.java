import java.util.Scanner;
class heightofplay{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);

        double[] heights=new double[11];
        double sum=0.0;
        for (int i=0;i<11;i++){
            System.out.print("Enter the height of "+(i+1)+": ");
            heights[i]=inp.nextDouble();
            sum+=heights[i];
        }
        double mean=sum/heights.length;
        System.out.println("The mean height of the football team is: "+mean);

    }
}
