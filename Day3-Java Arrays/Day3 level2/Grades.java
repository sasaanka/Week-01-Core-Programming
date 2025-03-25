import java.util.Scanner;
class grades{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num=input.nextInt();
        int marks[][]=new int[num][3];
        double[] percent=new double[num];
        char[] grades=new char[num];
        for(int i=0;i<num;i++){
             System.out.println("Enter marks for Student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
            String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                while (true) {
                    System.out.print(subject + ": ");
                    int mark = input.nextInt();
                    
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid input! Enter a positive value.");
                    }
                }
            }
            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percent[i] >= 80) {
                grades[i] = 'A';
            } else if (percent[i] >= 70) {
                grades[i] = 'B';
            } else if (percent[i] >= 60) {
                grades[i] = 'C';
            } else if (percent[i] >= 50) {
                grades[i] = 'D';
            } else if (percent[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }  
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");    
        for (int i = 0; i < num; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percent[i], grades[i]);
        }
    }
}
