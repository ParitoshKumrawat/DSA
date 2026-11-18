class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        if(s.equals(goal)){
            int[] freq = new int[26];

            for(char ch: s.toCharArray()){
                freq[ch - 'a']++;

                if(freq[ch - 'a'] >= 2)return true;
            }
            
            return false;
        }

        int first = -1;
        int sec = -1;

        for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) != goal.charAt(i)){
            if(first == -1){
                first = i;
            }else if(sec == -1){
                sec = i;
            }else{
                return false;
            }
           }
        }

        if(sec == -1)return false;

        return s.charAt(first) == goal.charAt(sec) && s.charAt(sec) == goal.charAt(first);
    }
}