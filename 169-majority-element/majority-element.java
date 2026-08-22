class Solution {
    public int majorityElement(int[] nums) {

        int major = nums.length/2;
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap();

        for(int i = 0 ; i<nums.length ; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }

        for(Integer i : mp.keySet()){
           if(mp.get(i) > major)ans = i;
        }

        return ans;

    }
}