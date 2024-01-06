# LeetCode 75 Solved in Java

### 1768. Merge Strings Alternately
![Problem Screenshot](./src/Problem_Screenshots/leetcode-problems-merge-strings-alternately-description-2024-01-06-12_58_02.png )

**Description:**  
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

<details>
  <summary><b>Explanation (click to expand)</b></summary>
This Java solution effectively merges two strings, word1 and word2, alternately by iterating through both strings and appending characters to the result string until one of the strings is exhausted. The code maintains two pointers, 'i' and 'j', to track the current positions in each string while appending characters alternatively. It utilizes a StringBuilder, 'result', to efficiently construct the merged string. The loop continues until both strings are fully traversed, ensuring the characters are added in an alternating fashion.

</details>
<details>
  <summary><b>Solution in Java (click to expand)</b></summary>

  ```java
  import java.util.Scanner;

  public class Merge_Strings_Alternatively_1768 {

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String str1 = scanner.nextLine();
          String str2 = scanner.nextLine();

          String ans = mergeAlternately(str1, str2);
          System.out.println(ans);
          scanner.close();
      }

      public static String mergeAlternately(String word1, String word2) {
          int i = 0, j = 0;
          StringBuilder result = new StringBuilder();
          int totalLength = word1.length() + word2.length();

          while (i < word1.length() || j < word2.length()) {
              if (i < word1.length()) {
                  result.append(word1.charAt(i++));
              }
              if (j < word2.length()) {
                  result.append(word2.charAt(j++));
              }
          }

          return result.toString();
      }
  }
```

</details>

### 1071. Greatest Common Divisor of Strings
![Problem Screenshot](./src/Problem_Screenshots/screencapture-leetcode-problems-greatest-common-divisor-of-strings-description-2024-01-06-19_52_03.png)

**Description:**
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

<details>
  <summary><b>Explanation (click to expand)</b></summary>
This Java solution finds the largest string 'x' that divides both 'str1' and 'str2'. It checks if the concatenation of 'str1' and 'str2' is equal to the concatenation of 'str2' and 'str1'. If they're not equal, there's no common divisor, and it returns an empty string.

If the concatenations match, the code calculates the GCD of the lengths of 'str1' and 'str2' using the Euclidean algorithm. The GCD represents the length of the largest common divisor string, which is obtained by extracting a substring from 'str1' of length 'gcdLength'.

This method efficiently identifies the largest string that divides both 'str1' and 'str2' by utilizing the GCD of their lengths.

</details>
<details>
  <summary><b>Solution in Java (click to expand)</b></summary>

  ```java
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

```

</details>