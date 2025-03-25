import java.util.Scanner;
class BMI{
    public static String[][] computeBmi(double[][] data){
        String[][] results=new String[data.length][4];
        for (int i=0;i<data.length;i++){
            double weight=data[i][0];
            double height=data[i][1]/100;
            double bmi=weight/height*height;
            bmi=Math.round(bmi*100.0)/100.0;
            String status;
            if (bmi<18.5){
                status="Under weight";
            }else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            results[i][0]=String.valueOf(weight);
            results[i][1]=String.valueOf(height);
             results[i][2] = String.valueOf(bmi);
            results[i][3] = status;
        }
        return results;
    }
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] peopleData = new double[10][2]; 
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            peopleData[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            peopleData[i][1] = scanner.nextDouble();
        }
        String[][] results = computeBmi(peopleData);
        displayResults(results);
    }
}
