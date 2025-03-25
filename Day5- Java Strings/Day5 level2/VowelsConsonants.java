import java.util.Scanner;
class VowelsConsonants{
    public static String CheckCharacter(char ch){
        ch=(ch>='A' &&ch<='Z')?(char)(ch+32):ch;
        if (ch >= 'a' && ch <= 'z') {
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "vowels";
        }else{
            return "consonants";
        }
        }
        return "Not a letter";
    }
    public static int[] countvowelsndConsonants(String text){
        int vowels=0,consonants=0;
        for (int i=0;i<text.length();i++){
            String type=CheckCharacter(text.charAt(i));
            if (type.equals("vowels")){
                vowels++;
            }else if (type.equals("consonants")) {
                consonants++;
            }
        }
        return new int[]{vowels,consonants};
    }
    public static void main(String[] args) {
        try(Scanner inp = new Scanner(System.in)){
        System.out.print("Enter a string: ");
        String text = inp.nextLine();
        inp.close(); 
        int[] result = countvowelsndConsonants(text);
        System.out.println("\nTotal Vowels: " + result[0]);
        System.out.println("Total Consonants: " + result[1]);
    }}
}
