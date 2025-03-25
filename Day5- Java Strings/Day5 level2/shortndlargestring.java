import java.util.Scanner;
class shortndlargestring{
    public static int countwords(String text){
        int count=(text.length()>0)?1:0;
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)==' '){
                count++;
            }
        }
    return count;
    }
    public static String[] customsplit(String text){
        int wordscount=countwords(text);
        String[] words=new String[wordscount];
        int start=0,index=0;
        for (int i=0;i<text.length();i++){
            if (text.charAt(i)==' '){
                words[index++]=text.substring(start,i);
                start=i+1;
            }
        }
        words[index] = text.substring(start);  
        return words;
    }
    public static int findLength(String word) {
        int
         count = 0;
        try {
            while (true) {
                
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
    public static String[] findShortestAndLongest(String[][] wordTable) {
        String shortestWord = wordTable[0][0], longestWord = wordTable[0][0];
        int shortestLength = Integer.parseInt(wordTable[0][1]);
        int longestLength = shortestLength;
        for (String[] row : wordTable) {
            int wordLength = Integer.parseInt(row[1]);
            if (wordLength < shortestLength) {
                shortestLength = wordLength;
                shortestWord = row[0];
            }
            if (wordLength > longestLength) {
                longestLength = wordLength;
                longestWord = row[0];
            }
        }
        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
    }
    public static void main(String[] args) {
        try(Scanner inp = new Scanner(System.in)){
        System.out.print("Enter a sentence: ");
        String text = inp.nextLine();
        inp.close(); 
        String[] words = customsplit(text);
        String[][] wordTable = wordsWithLengths(words);
        String[] result = findShortestAndLongest(wordTable);
        System.out.println("\nWord\t\tLength");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        System.out.println("\nShortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word: " + result[2] + " (Length: " + result[3] + ")");
    }}

}
