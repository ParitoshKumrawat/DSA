class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddsum = 0;
        int n = arr.length;
        
        int[] prefix = new int[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + arr[i];
        }

        for(int k = 1; k <= n; k += 2){
            for(int i = 0; i + k <= n; i++){
                int j = i + k - 1;

                int windowsum = prefix[j + 1] - prefix[i];

                oddsum += windowsum;
            }
        }

        return oddsum;
    }
}