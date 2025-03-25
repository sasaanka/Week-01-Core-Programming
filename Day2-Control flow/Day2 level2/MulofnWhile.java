import java.util.Scanner;
class mulofnwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (1-99): ");
        int num = input.nextInt();

        if (num <= 0 || num >= 100) {
            System.out.println("Invalid input! Enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + num + " below 100:");
            int counter = num;
            while (counter < 100) {
                System.out.println(counter);
                counter += num; // Increment by num to find the next multiple
            }
        }
        
    }
}
