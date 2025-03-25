import java.util.Scanner;
class numberformatexception{
    public static void generateexception(String text){
        int num=Integer.parseInt(text);
        System.out.print("The extracted num is : "+ num);
    }
    public static void handleexception(String text){
        try {
            @SuppressWarnings("unused")
            int num=Integer.parseInt(text);
            
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: invalid format "+e.getMessage());
        }catch (Exception e ){
            System.out.println("Generic exception caught "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String text=inp.nextLine();
        try {
            generateexception(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: Invalid number format! " + e.getMessage());
        }
        System.out.println("\nHandling exception");
        handleexception(text);
    }
}
