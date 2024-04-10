class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1){
            return 0;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int max_matrix = 0;
        int[][] dp = new int[row + 1][col + 1];

        for(int r = 0; r < row ; r++){
            for(int c = 0; c < col ; c++){
                if(matrix[r][c] == '1'){
                    dp[r+1][c+1] = Math.min(dp[r][c], Math.min(dp[r+1][c], dp[r][c+1])) + 1;
                    max_matrix = Math.max(max_matrix, dp[r+1][c+1]);
                }
            }
        }
        return max_matrix * max_matrix;
    }
}
