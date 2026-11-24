class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++){
            int product = 1;
            int gcd = 0;
            int lcm = 1;

            for(int j = i; j < nums.length; j++){
                product *= nums[j];

                gcd = gcd(gcd, nums[j]);

                lcm = lcm(lcm, nums[j]);

                if(product == lcm * gcd){
                    int len = j - i + 1;

                    maxLength = Math.max(maxLength, len);
                }
            }
        }

        return maxLength;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int rem = a % b;

            a = b;
            b = rem;
        }

        return a;
    }

    private int lcm(int a, int b){
        return (a / gcd(a, b)) * b;
    }
}