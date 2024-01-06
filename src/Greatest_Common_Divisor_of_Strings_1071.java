import java.util.Scanner;

public class Greatest_Common_Divisor_of_Strings_1071 {
    public static String gcdOfStrings(String str1, String str2) {
        if(!str1.concat(str2).equals(str2.concat(str1))){
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0,gcdLength);
    }

    public static int gcd(int num1, int num2){
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String result = gcdOfStrings(str1, str2);
        System.out.println(result);
    }
}
