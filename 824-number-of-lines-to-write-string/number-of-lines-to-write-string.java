class Solution {
    public int[] numberOfLines(int[] widths, String s) {
      int line = 1;
      int curWidth = 0;

      for(char ch: s.toCharArray()){
        int width = widths[ch - 'a'];

        if(curWidth + width <= 100){
            curWidth += width;
        }else{
            line++;
            curWidth = width;
        }
      }

      return new int[]{line, curWidth};
    }
}