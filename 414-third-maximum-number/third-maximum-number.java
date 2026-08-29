class Solution {
    public int thirdMax(int[] nums) {
     Long first = null;
     Long sec = null;
     Long thd = null;

     for(int num : nums){
        if(
            (first != null && first == num) ||
            (sec != null && sec == num) ||
            (thd != null && thd == num)
        ){
            continue;
        }

        if(first == null || num > first){
            thd = sec;
            sec = first;
            first = (long)num;
        }
        else if(sec == null || num > sec){
            thd = sec;
            sec = (long)num;
        }
        else if(thd == null || num > thd){
            thd = (long) num;
        }
     }

     return thd == null ? first.intValue() : thd.intValue();
    }
}