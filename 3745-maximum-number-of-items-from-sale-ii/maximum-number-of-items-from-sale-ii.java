
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        int maxFactor = 0;

        for (int[] item : items) {
            maxFactor = Math.max(maxFactor, item[0]);
        }

        // Step 2: Frequency of each factor
        int[] freq = new int[maxFactor + 1];

        for (int[] item : items) {
            freq[item[0]]++;
        }

        // Step 3: Count all divisible item types
        int[] gain = new int[maxFactor + 1];

        for (int f = 1; f <= maxFactor; f++) {

            int count = 0;

            for (int multiple = f;
                 multiple <= maxFactor;
                 multiple += f) {

                count += freq[multiple];
            }

            gain[f] = count - 1;
        }

        // Step 4: Find minimum price
        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            minPrice = Math.min(minPrice, item[1]);
        }

        // Step 5: Sort items by price
        Arrays.sort(items, Comparator.comparingInt(a -> a[1]));

        long remainingBudget = budget;
        long answer = 0;

        // Step 6: Buy reward-generating copies greedily
        for (int[] item : items) {

            int factor = item[0];
            int price = item[1];

            if (gain[factor] == 0) {
                continue;
            }

            // No longer beneficial compared to
            // buying two cheapest normal items
            if (price >= 2L * minPrice) {
                break;
            }

            // Maximum reward-generating purchases
            long canBuy = Math.min(
                gain[factor],
                remainingBudget / price
            );

            answer += canBuy * 2;
            remainingBudget -= canBuy * price;
        }

        // Step 7: Spend remaining money on cheapest items
        answer += remainingBudget / minPrice;

        return (int) answer;
    }
}
