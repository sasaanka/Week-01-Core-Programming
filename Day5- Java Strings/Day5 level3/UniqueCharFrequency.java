import java.util.Scanner;
class UniqueCharFrequency {

    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        return result;
    }
    public static String[][] findCharacterFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = Character.toString(uniqueChars[i]); 
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        return result;
    }
    public static void displayFrequency(String[][] freqTable) {
        System.out.println("\nCharacter | Frequency");
        for (String[] row : freqTable) {
            System.out.println("    " + row[0] + "      |    " + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencyTable = findCharacterFrequency(input);
        displayFrequency(frequencyTable);
    }
}
