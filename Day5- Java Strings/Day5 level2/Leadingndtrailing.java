import java.util.Scanner;
class Leadingndtrailing{
    public static int[] findtrimindices(String text){
        int start=0;
        int end=text.length()-1;
        while(start<=end && text.charAt(start)==' '){
            start++;
        }
        while(end>=start && text.charAt(end)==' '){
            end--;
        }
        return new int[]{start,end};
    }
    public static String manualsubString(String text,int start,int end){
        StringBuilder result=new StringBuilder();
        for (int i=start;i<end;i++){
            result.append(text.charAt(i));
        }
        return result.toString();
    }
    public static boolean Comparestrings(String s1,String s2){
        if(s1.length()!=s2.length()){
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
        System.out.print("ENter a string with leading and trailing spaces: ");
        String text=inp.nextLine();
        int[] trimindices=findtrimindices(text);
        String manuallytrimmed=manualsubString(text, trimindices[0], trimindices[1]+1);
        String builtin=text.trim();
        boolean issame=Comparestrings(manuallytrimmed, builtin);
        System.out.println("The manually trimmed string is : ["+manuallytrimmed+" ]");
        System.out.println("The string trimmed using trim() is : ["+builtin+"]");
        System.out.println("Are both same? "+issame);
    }
}
