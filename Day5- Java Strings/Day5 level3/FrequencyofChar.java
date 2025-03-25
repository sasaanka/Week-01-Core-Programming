import java.util.Scanner;
class FrequencyofChar{
    public static String[][] charFrequency(String text){
        int[] freq=new int[256];
        for (int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch]++;
        }
        int uniquecount=0;
        for (int i=0;i<256;i++){
            if (freq[i]>0){
                uniquecount++;
            }
        }
        String[][] result = new String[uniquecount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i); 
                result[index][1] = Integer.toString(freq[i]); 
                index++;
            }
        }
        return result;
    }
     public static void displayFrequency(String[][] freqTable) {
        System.out.println("\nCharacter | Frequency");
        for (String[] row : freqTable) {
            System.out.println("    " + row[0] + "         " + row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String[][] frequencyTable = charFrequency(input);
        displayFrequency(frequencyTable);
}
}
