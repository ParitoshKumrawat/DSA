class Solution {
    public String toLowerCase(String s) {
        int n = s.length();
        String ans = "";

        for(int i = 0; i < n; i++){
            int ch = s.charAt(i);

            if(ch >= 65 && ch <= 90){
             int smallCh = ch + 32;
             ans += (char)smallCh;
            }else{
              ans += (char)ch;
            }
        }


        return ans;
    }
}