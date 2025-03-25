import java.util.Scanner;
class arrayindexecception{
    public static void generateexception(String[] names,int index){
         System.out.println("Accessing element at index " + index + ": " + names[index]);
    }
    public static void handleexception(String[] names,int index){
        try {
            System.out.println("Accessing element at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught : Invalid index"+e.getMessage());
        }catch(Exception e){
            System.out.println(" GEneric Exception caught : "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int size=inp.nextInt();
        inp.nextLine();
        String[] names=new String[size];
         System.out.print("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = inp.nextLine();
        }
        System.out.print("Enter the index to access: ");
        int index = inp.nextInt();
        try {
            generateexception(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: Invalid index! " + e.getMessage());
        }
        System.out.println("\nHandling ArrayIndexOutOfBoundsException...");
        handleexception(names, index);
    }
}
