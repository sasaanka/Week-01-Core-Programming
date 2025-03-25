import java.util.Scanner;
class grades{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENter the marks in MAths: ");
        int maths=input.nextInt();
        System.out.print("ENter the marks in Physics: ");
        int phy=input.nextInt();
        System.out.print("ENter the marks in Chemistry: ");
        int che=input.nextInt();
        int totalmarks=maths+phy+che;
        double totalper=(totalmarks/3.0);
        String remarks,grade;
        if (totalper>=80){
            grade="A";
            remarks="Level 4, above agency-normalized students";
        }else if(totalper>=70){
            grade="B";
            remarks="Level 3, at agency-normalized students";
        }else if(totalper>=60){
            grade="C";
            remarks="Level 2,below, but approaching agency-normalized standards";
        }else if (totalper>=50){
            grade="D";
            remarks="Level 1 well below, agency-normalized standards";
        }else if(totalper>=40){
            grade="E";
            remarks="Level 1, too below agency-normalized standards";
        }else{
            grade="R";
            remarks=" Remedial Standards";
        }
        System.out.println("Total marks= "+totalmarks);
        System.out.println("Total percentage= "+totalper);
        System.out.println("Grade obtained is = "+grade);
        System.out.println("Remarks:  "+remarks);
    }
}
