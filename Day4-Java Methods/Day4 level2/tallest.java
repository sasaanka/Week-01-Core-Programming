import java.util.Scanner;
class tallest{
    public static String FindYoungest(String[] name,int[] age){
        int minage=age[0];
        int minindex=0;
        for(int i=0;i<age.length;i++){
            if (age[i]<minage){
                minage=age[i];
                minindex=i;
            }
        }
        return name[minindex];
    }
    public static String FindTallest(String[] names,double[] heights){
        double maxheight=heights[0];
        int maxindex=0;
        for (int i=0;i<heights.length;i++){
            if (heights[i]>maxheight){
                maxheight=heights[i];
                maxindex=i;
            }
        }
        return names[maxindex];
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        String[] names={"Amar","Akbar","Antony"};
        int[] ages=new int[names.length];
        double[] heights=new double[names.length];
        for (int i=0;i<3;i++){
            System.out.print("Enter the age of "+names[i]+" : ");
            ages[i]=inp.nextInt();
            System.out.print("Enter the height "+names[i]+" : ");
            heights[i]=inp.nextDouble();

        }
        String youngest= FindYoungest(names,ages);
        String tallest=FindTallest(names,heights);

        System.out.println("The youngest among three is "+ youngest);
        System.out.println("The tallest among three is "+ tallest);

    }
}
