import java.util.Scanner;
class marks2d{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num=input.nextInt();
        int subjects=3;
        String[] subnames={"Maths","Physics","Chemistry"};
        int[][] marks=new int[num][subjects];
        double[] Percentage=new double[num];
        char[] grades=new char[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter marks for the student "+(i+1));
            for(int j=0;j<subjects;j++){
                while(true){
                    System.out.print(subnames[j]+": ");
                    marks[i][j]=input.nextInt();
                    if (marks[i][j]>=0 && marks[i][j]<=100){
                        break;
                    }
                    System.out.println("Enter invalid input");
                }
            }
        }
        for (int i=0;i<num;i++){
            int totalmarks=0;
            for (int j=0;j<subjects;j++){
                totalmarks+=marks[i][j];
            }
            Percentage[i]=(double)totalmarks/subjects;
            if (Percentage[i]>=80){
                grades[i]='A';
            }else if(Percentage[i]>=70){
                grades[i]='B';
            }else if(Percentage[i]>=60){
                grades[i]='C';
            }else if(Percentage[i]>=50){
                grades[i]='D';
            }else if(Percentage[i]>=40){
                grades[i]='E';
            }else{
                grades[i]='R';
            }
        }
        System.out.println("\nStudent Results:");
        for (int i = 0; i < num; i++) {
           System.out.println("Student " + (i + 1) + ": Physics = " + marks[i][0] +
            ", Chemistry = " + marks[i][1] + ", Maths = " + marks[i][2] +
            ", Percentage = " + Percentage[i] + "%, Grade = " + grades[i]);
}
}
}
