class Solution {
    public int findLHS(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int longest = 0;
        
        for(int right = 1 ; right < nums.length ; right++){
          while(nums[right] - nums[left] > 1){
            left++;
          }
          if(nums[right] - nums[left] == 1){
            longest = Math.max(longest, right - left + 1);
          }
        }

        return longest;
    }
}