class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int colomn = matrix[0].length;
        int [][] tm = new int[colomn][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<colomn; j++){
                tm[j][i] = matrix[i][j];
            }
        }
        return tm;
    }
}