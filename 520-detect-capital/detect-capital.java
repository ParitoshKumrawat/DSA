class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;

        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch))cnt++;
        }

        return cnt == 0 || cnt == word.length() || (cnt == 1 && Character.isUpperCase(word.charAt(0)));
    }
}