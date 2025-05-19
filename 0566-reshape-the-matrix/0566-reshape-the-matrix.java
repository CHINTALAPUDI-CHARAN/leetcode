class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int mr = mat.length;
        int mc = mat[0].length;
        int row = 0;
        int col = 0;
        if(r*c != mr*mc){
            return mat;
        }
        else{
        for(int i = 0;i<mr;i++){
            for(int j=0;j<mc;j++){
               arr[row][col] = mat[i][j];
               col++;
               if(col == c){
                row++;
                col = 0;
               } 
            }
        }
        return arr;
    }
 }
}