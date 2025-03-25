import java.util.Scanner;

class lengthofstring{
    public static int findlength(String s1){
        int count=0;
        try {
            while(true){
                @SuppressWarnings("unused")
                char ch=s1.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text=inp.nextLine();
        int manuallength=findlength(text);
        int builtinlength=text.length();
        System.out.println("The length of the string without using length() is "+manuallength);
        System.out.println("The length of the string with using length() is "+builtinlength);
    }
}
