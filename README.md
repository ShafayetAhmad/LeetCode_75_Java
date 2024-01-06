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


