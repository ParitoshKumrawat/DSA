class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1)return 1;

        HashSet<Character> st = new HashSet<>();
        int maxLen = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(st.contains(ch)){
                st.remove(ch);
                maxLen += 2;
            }else{
                st.add(ch);
            }
        }

        if(!st.isEmpty()){
                maxLen++;
        }

        return maxLen;
    }
}