import java.util.Scanner;
public class AnagramCheck {
    public static boolean isAnagram(String text1, String text2) {
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i) - 'a']++;
            freq2[text2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the second text: ");
        String input2 = scanner.nextLine();
        if (isAnagram(input1, input2)) {
            System.out.println("The texts are Anagrams.");
        } else {
            System.out.println("The texts are NOT Anagrams.");
        }
    }
}
