import java.util.Scanner;
class factorsofnum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = inp.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        for (int i = 1; i <= num; i++) { 
            if (num % i == 0) { 
                if (index == maxFactor) { 
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i; 
            }
        }
        System.out.print("The factors of " + num + " are: ");
        for (int i = 0; i < index; i++) { 
            System.out.print(factors[i] + " ");
        }
        System.out.println();

    }
}
