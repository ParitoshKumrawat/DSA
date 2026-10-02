class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int perimeter = 0;

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 0)continue;

                for(int[] dir : directions){
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if(
                        ni < 0 || ni >= row ||
                        nj <0 || nj >= col
                    )perimeter++;

                    else if(grid[ni][nj] == 0)perimeter++;
                }
            }
        }

        return perimeter;
    }
}