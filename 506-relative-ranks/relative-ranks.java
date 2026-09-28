class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;

        int[][] pairs = new int[n][2];

        for(int i = 0 ; i < n ; i++){
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        String[] ans = new String[n];

        for(int i = 0 ; i < n ; i++){
            int oInd = pairs[i][1];

            if(i == 0)ans[oInd] = "Gold Medal";
            else if(i == 1)ans[oInd] = "Silver Medal";
            else if(i == 2)ans[oInd] = "Bronze Medal";
            else ans[oInd] = String.valueOf(i + 1);
        }

        return ans;
    }
}