import java.util.Scanner;
public class daysofweek {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter month: ");
        int m = scanner.nextInt();
        System.out.print("Enter day: ");
        int d = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        System.out.println("Day of the week : " + d0);
    }
}
}
