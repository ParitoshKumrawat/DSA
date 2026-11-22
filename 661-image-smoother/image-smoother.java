class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;

        int[][] result = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                int sum = 0;
                int cnt = 0;

                for(int a = i - 1; a <= i + 1; a++){
                    for(int b = j - 1; b <= j + 1; b++){

                        if(a >= 0 && a < n && b >=0 && b < m){
                            sum += img[a][b];
                            cnt++;
                        }
                    }
                }

                result[i][j] = sum / cnt;
            }
        }

        return result;
    }
}