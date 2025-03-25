import java.util.Scanner;
class stringtochar{
    public static char[] manualtochar(String str){
        int length=str.length();
        char[] charArray=new char[length];
        for (int i=0;i<length;i++){
            charArray[i]=str.charAt(i);
        }
    return charArray;
    }
    public static boolean comparetwochararray(char[] array1,char[] array2){
        if (array1.length!=array2.length){
            return false;
        }
        for (int i=0;i<array1.length;i++){
            if (array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a string ");
        String text=inp.nextLine();
        char[] manualarray=manualtochar(text);
        char[] builtin=text.toCharArray();
        System.out.print("String to array manually: " );
        System.out.println(manualarray);
        System.out.print("String to array builtin: " );
        System.out.println(builtin);
        boolean compare=comparetwochararray(manualarray,builtin);
        System.out.println("Are both equal? " + compare);
    }
}
