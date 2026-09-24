class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        // Mark numbers that are present
        for (int num : nums) {
            int index = Math.abs(num) - 1;

            nums[index] = -Math.abs(nums[index]);
        }

        // Positive index means the number is missing
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}