import java.util.Scanner;
class SubString {
    public static String substringcreate(String s1,int start,int end){
        String result="";
        for (int i=start;i<end;i++){
            result+=s1.charAt(i);
        }
    return result;
    }
    public static boolean comparetwostrings(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text = inp.nextLine();
        System.out.print("Enter the start index: ");
        int start=inp.nextInt();
        System.out.print("enter the end index: ");
        int end=inp.nextInt();

        if (start<0 || end>text.length() || start>=end){
            System.out.println("Invalid indices");
        }
        else{
            String charAtusing=substringcreate(text,start,end);
            String builtin=text.substring(start,end);
            System.out.println("the string using CHarAT() is : " + charAtusing);
            System.out.println("The string using butilin is : " + builtin);
            boolean isEqual = comparetwostrings(charAtusing,builtin);
            System.out.println("Substring using charAt(): " + charAtusing);
            System.out.println("Substring using substring(): " + builtin);
            System.out.println("Are both substrings equal? " + isEqual);
        }
    }
}
