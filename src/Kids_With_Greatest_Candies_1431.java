import java.util.*;

public class Kids_With_Greatest_Candies_1431 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        int candies = in.nextInt();
        List<Boolean> ans = kidsWithCandies(arr, candies);

        System.out.println(ans.toString());

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i] > highest) highest = candies[i];
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= highest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
