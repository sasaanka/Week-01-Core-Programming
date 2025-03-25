import java.util.Scanner;
class Comparestrings{
    public static boolean comparetwostrings(String s1,String s2){
        if (s1.length()!=s2.length()){
            return false;
        }
        for (int i=0;i<s1.length();i++){
            if (s1.length()!=s2.length()){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the string 1: ");
        String s1=inp.next();
        System.out.print("Enter the string 2: ");
        String s2=inp.next();
        boolean resultcharAt=comparetwostrings(s1,s2);
        boolean resultinbuilt=s1.equals(s2);
        System.out.println("The result of the string using charAt is: "+resultcharAt);
        System.out.println("The result of the string using builtin is: "+resultinbuilt);
        if (resultcharAt==resultinbuilt){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal");
        }
    }
}
