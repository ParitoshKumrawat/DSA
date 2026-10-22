class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        int prv = -n;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == c){
                prv = i;
            }

            ans[i] = i - prv;
        }

        prv = 2 * n;

        for(int i = n - 1; i >= 0; i--){
            if(s.charAt(i) == c){
                prv = i;
            }

            ans[i] = Math.min(ans[i], prv - i);
        }

        return ans;
    }
}