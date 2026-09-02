class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avgMax = 0;
        int sum = 0;

        for(int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        
        avgMax = (double)sum / k;

        for(int i = k ; i < nums.length ; i++){
            sum += nums[i];
            sum -= nums[i - k];

            avgMax = Math.max(avgMax, (double)sum / k);
        }

        return avgMax;
    }
}