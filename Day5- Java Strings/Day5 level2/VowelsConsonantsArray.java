import java.util.Scanner;
class VowelsConsonantsArray{
    public static String CheckString(char ch){
        ch=(ch>='A' && ch<='Z')?(char)(ch+32):ch;
        if (ch>='a' && ch<='z'){
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowels";
            }else{
                return "Consonants";
            }
        }
        return "Not a letter";
    }
    public static String[][] classifyCharacter(String text){
        String[][] result=new String[text.length()][2];
        for (int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            result[i][0]=String.valueOf(ch);
            result[i][1]=CheckString(ch);
        }
        return result;
    }
    public static void DisplayTable(String[][] table){
        System.out.println("Character\tType");
        for (String[] row:table){
            System.out.println(row[0]+"\t\t"+row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = inp.nextLine();
        String[][] classifiedChars = classifyCharacter(text);
        DisplayTable(classifiedChars);
    }
}
