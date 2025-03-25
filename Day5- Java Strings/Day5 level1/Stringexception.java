import java.util.Scanner;
class Stringexception{
    public static void generateexception(String text){
        int invalidindex=text.length();
        System.out.print(text.charAt(invalidindex));
    }
    public static void handleexception(String text){
        int invalidindex=text.length();
        try {
            System.out.println("Character at index " + invalidindex + ": " + text.charAt(invalidindex));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text=inp.nextLine();
        try {
            System.out.print("Generating exception");
            generateexception(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        handleexception(text);
    }
}
