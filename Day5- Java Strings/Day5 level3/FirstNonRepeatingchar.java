import java.util.Scanner;
class FirstNonRepeatingchar{
    public static char firstnonrepeating(String text){
        int[] frequency=new int[256];
        for (int i=0;i<text.length();i++){
            char currentchar=text.charAt(i);
            frequency[currentchar]++;
        }
        for (int i=0;i<text.length();i++){
            char currentchar=text.charAt(i);
            if (frequency[currentchar]==1){
                return currentchar;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text=inp.nextLine();
        char result=firstnonrepeating(text);
        if (result!=0){
            System.out.println("The first non repeating character is "+result);
        }else{
            System.out.println("No non-repeating characters found");
        }
    }
}
