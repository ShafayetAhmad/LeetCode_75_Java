import java.util.Scanner;

public class Merge_Strings_Alternatively_1768 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String ans = mergeAlternately(str1, str2);
        System.out.println(ans);
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, totalLength = word1.length() + word2.length();
        StringBuilder result = new StringBuilder();
        while(i < word1.length() || j < word2.length()){
            if(i < word1.length()){
                result.append(word1.charAt(i++));
            }  if(j < word2.length()){
              result.append(word2.charAt(j++));
            }
        }
        return  result.toString();
    }
}
