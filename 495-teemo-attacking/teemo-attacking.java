class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;

        if(timeSeries.length == 0)return 0;

        total = duration;

        for(int i = 1; i < timeSeries.length; i++){
            int gap = timeSeries[i] - timeSeries[i - 1];
            total += Math.min(duration, gap);
        }

        return total;
    }
}