import java.util.Scanner;
class ToUppercase{
    public static String ConvertToUpper(String s1){
        String result="";
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if (ch>='a' && ch<='z'){
                ch=(char)(ch-32);
            }
            result+=ch;
        }
        return result;
    }
    public static boolean Comparestrings(String s1,String s2){
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
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text=inp.nextLine();
        String manualuppercase=ConvertToUpper(text);
        String formulausingtoupper=text.toUpperCase();
        boolean issame=Comparestrings(manualuppercase, formulausingtoupper);
        System.out.println("Converted string using charAt is "+manualuppercase);
        System.out.println("Converted string  builtin function is "+formulausingtoupper);
        System.out.println("Are both same? " +issame);
    }
}
