class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int consecutiveL = 0;

        for(char c : s.toCharArray()){
            if(c == 'A'){
              absent++;

              if(absent > 1)return false;

              consecutiveL = 0;
            }

            else if(c == 'L'){
                consecutiveL++;

                if(consecutiveL >= 3)return false;

            }

            else consecutiveL = 0;
        }

        return true;
    }
}