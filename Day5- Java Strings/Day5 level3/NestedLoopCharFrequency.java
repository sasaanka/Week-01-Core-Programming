import java.util.Scanner;

class NestedLoopCharFrequency {
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); 
        int length = chars.length;
        int[] frequency = new int[length];
        for (int i = 0; i < length; i++) {
            frequency[i] = -1;
        }
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; 
            int count = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0'; 
                }
            }
            frequency[i] = count;
        }
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq != -1) uniqueCount++;
        }
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (frequency[i] != -1) {
                result[index] = chars[i] + " = " + frequency[i];
                index++;
            }
        }
        return result;
    }
    public static void displayFrequency(String[] freqArray) {
        System.out.println("\nCharacter | Frequency");
        for (String entry : freqArray) {
            System.out.println("    " + entry.replace("=", "   |"));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[] frequencyTable = findCharacterFrequency(input);
        displayFrequency(frequencyTable);
      
    }
}
