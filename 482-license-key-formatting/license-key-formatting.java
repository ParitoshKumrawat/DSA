class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch != '-'){
                sb.append(Character.toUpperCase(ch));
            }
        }

        StringBuilder ans = new StringBuilder();
        int cnt = 0;

        for(int i = sb.length() - 1 ; i >= 0 ; i--){
            if(cnt == k){
                ans.append('-');
                cnt = 0;
            }

            ans.append(sb.charAt(i));
            cnt++;
        }

        return ans.reverse().toString();
        
    }
}