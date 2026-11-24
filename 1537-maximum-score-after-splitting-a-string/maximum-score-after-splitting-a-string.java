class Solution {
    public int maxScore(String s) {
        int leftZeros = 0;
        int rightOne = 0;
        int maxsum = 0;

        for(char ch: s.toCharArray()){
            if(ch == '1')rightOne++;
        }

        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            
            if(ch == '0'){
                leftZeros++;
            }else{
                rightOne--;
            }

            maxsum = Math.max(maxsum, leftZeros + rightOne);
        }

        return maxsum;
    }
}