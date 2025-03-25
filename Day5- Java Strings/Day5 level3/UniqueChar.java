import java.util.Scanner;
class UniqueChar{
    public static int stringLength(String text){
        int count=0;
        try {
            while (text.charAt(count)!=0){
                count++;
            }
        } catch (Exception e) {
            
        }
        return count;
    }
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static char[] uniqueCharacter(String text){
        int length=stringLength(text);
        char[] uniquechar=new char[length];
        int uniquecount=0;
        for (int i=0;i<length;i++){
            char currentchar=text.charAt(i);
            boolean isunique=true;
            for (int j=0;j<uniquecount;j++){
                if (uniquechar[j]==currentchar){
                    isunique=false;
                    break;
                }
            }
            if (isunique){
                uniquechar[uniquecount]=currentchar;
                uniquecount++;
            }
        }
        char[] result = new char[uniquecount];
        for (int i = 0; i < uniquecount; i++) {
            result[i] = uniquechar[i];
        }
        return result;
    }
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.print("Unique Characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char[] uniqueChars = uniqueCharacter(input);
        displayUniqueCharacters(uniqueChars);
}
}
