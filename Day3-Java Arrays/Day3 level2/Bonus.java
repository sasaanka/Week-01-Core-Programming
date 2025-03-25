import java.util.Scanner;
class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numemployee = 10;
        double salary[] = new double[numemployee];
        double yearofser[] = new double[numemployee];
        double newsalary[] = new double[numemployee];
        double bonus[] = new double[numemployee];
        double totalbonus = 0.0, totaloldsalary = 0.0, totalnewsalary = 0.0;
        for (int i = 0; i < numemployee; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter salary of employee: ");
                salary[i] = input.nextDouble();
                if (salary[i] > 0) break;
                System.err.println("Invalid salary! Please enter a positive value.");
            }
            while (true) {
                System.out.print("Enter years of service of employee: ");
                yearofser[i] = input.nextDouble();
                if (yearofser[i] >= 0) break; 
                System.err.println("Invalid years of service! Please enter a non-negative value.");
            }
        }
        for (int i = 0; i < numemployee; i++) {
            if (yearofser[i] > 5) {
                bonus[i] = salary[i] * 0.05;  
            } else {
                bonus[i] = salary[i] * 0.02;  
            }
            newsalary[i] = salary[i] + bonus[i];
            totalbonus += bonus[i];
            totaloldsalary += salary[i];
            totalnewsalary += newsalary[i];
        }
        System.out.println("\nEmployee Bonus Details:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp No.", "Salary", "Years", "Bonus", "New Salary");  
        for (int i = 0; i < numemployee; i++) {
            System.out.printf("%-10d %-10.2f %-10.1f %-10.2f %-10.2f\n",(i + 1), salary[i], yearofser[i], bonus[i], newsalary[i]);
        }    
        System.out.println("\nTotal Payout Summary:");     
        System.out.printf("Total Old Salary: %.2f\n", totaloldsalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalbonus);
        System.out.printf("Total New Salary: %.2f\n", totalnewsalary);
        
    }
}
