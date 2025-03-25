import java.util.Scanner;
class Tolowercase{
    public static String Tolowercase(String s1){
        String result="";
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if (ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
        result+=ch;
        }
    return result;
    }
    public static boolean Comparestrings(String s1, String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String text=inp.nextLine();
        String manuallowercase=Tolowercase(text);
        String usinginbuilt=text.toLowerCase();
        boolean issame=Comparestrings(manuallowercase,usinginbuilt);
        System.out.println("The converted string using CharAt is "+manuallowercase);
        System.out.println("The converted string using CharAt is "+usinginbuilt);
        System.out.println("Are both same? "+issame);
    }
}
