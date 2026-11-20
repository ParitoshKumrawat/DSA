class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int totalEle = mat.length * mat[0].length;
        int reqEle = r * c;

        if(totalEle != reqEle)return mat;

        int[][] reshaped  = new int[r][c];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
               int indx = i * mat[0].length + j;

               int newRow = indx / c;
               int newCol = indx % c;

               reshaped[newRow][newCol] = mat[i][j];
            }
        }

        return reshaped;        
    }
}