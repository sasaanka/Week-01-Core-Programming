import java.util.Arrays;
import java.util.Scanner;
class SplitText{
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
        int wordcount=countwords(text);
        String[] words=new String[wordcount];
        int start=0, index=0;
        for (int i=0;i<=text.length();i++){
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index] = text.substring(start, i); // Extract word
                start = i + 1; // Move start to next word
                index++;
        }
        }
        return words;
    }
    public static boolean compareArrays(String[] arr1,String[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i=0;i<arr1.length;i++){
            if (arr1[i].equals(arr2[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = inp.nextLine();
        String[] customResult = customsplit(text);
        String[] builtInResult = text.split(" ");
        boolean isEqual = compareArrays(customResult, builtInResult);
        System.out.println("Words using custom split method: " + Arrays.toString(customResult));
        System.out.println("Words using built-in split() method: " + Arrays.toString(builtInResult));
        System.out.println("Are both results equal? " + isEqual);
    }
}
