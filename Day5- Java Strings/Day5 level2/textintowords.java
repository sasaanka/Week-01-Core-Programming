import java.util.Scanner;

class textintowords {
    public static int countWords(String text) {
        int count = (text.length() > 0) ? 1 : 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        int start = 0, index = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i); 
                start = i + 1;
            }
        }
        words[index] = text.substring(start);  
        return words;
    }

    public static int findLength(String word) {
        int count = 0;
        try {
            while (true) {
                @SuppressWarnings("unused")
                char ch=word.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[][] wordsWithLengths(String[] words) {
        String[][] wordTable = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordTable[i][0] = words[i]; 
            wordTable[i][1] = String.valueOf(findLength(words[i])); 
        }
        return wordTable;
    }
    public static void main(String[] args) {
        String text;
        try (Scanner inp = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            text = inp.nextLine();  
        }
        String[] words = customSplit(text);
        String[][] wordTable = wordsWithLengths(words);
        System.out.println("\nWord\t\tLength");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);  
        }
    }
}
