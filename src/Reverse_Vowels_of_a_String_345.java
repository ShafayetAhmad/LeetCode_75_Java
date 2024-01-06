import java.util.Scanner;

public class Reverse_Vowels_of_a_String_345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder(s);
        int start = 0, end = s.length()-1;
        while(start <= end){
            while(start < end && vowels.indexOf(s.charAt(start)) == -1){
                start++;
            }
            while(end > start && vowels.indexOf(s.charAt(end)) == -1){
                end--;
            }
            char temp = result.charAt(start);
            result.setCharAt(start++, result.charAt(end));
            result.setCharAt(end--, temp);
        }

        return result.toString();
    }
}
