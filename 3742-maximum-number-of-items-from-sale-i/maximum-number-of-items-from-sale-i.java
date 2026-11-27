
class Solution {
    public int maximumSaleItems(int[][] items, int budget) {

        int n = items.length;

        int[] dp = new int[budget + 1];

        int minPrice = Integer.MAX_VALUE;

        for (int[] item : items) {
            minPrice = Math.min(minPrice, item[1]);
        }

        for (int i = 0; i < n; i++) {

            int factor = items[i][0];
            int price = items[i][1];

            int freeCount = 0;

            for (int j = 0; j < n; j++) {

                if (i != j && items[j][0] % factor == 0) {
                    freeCount++;
                }
            }

            int reward = freeCount + 1;

            for (int b = budget; b >= price; b--) {

                dp[b] = Math.max(
                    dp[b],
                    dp[b - price] + reward
                );
            }
        }

        int answer = 0;

        for (int b = 0; b <= budget; b++) {

            int remaining = budget - b;

            int additionalItems = remaining / minPrice;

            answer = Math.max(
                answer,
                dp[b] + additionalItems
            );
        }

        return answer;
    }
}
