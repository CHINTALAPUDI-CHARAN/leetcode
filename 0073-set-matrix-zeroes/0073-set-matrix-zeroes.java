class Solution {
    public void setZeroes(int[][] matrix) {
        int size = matrix.length;
        int colsize = matrix[0].length;
        boolean[] rzero = new boolean[size];
        boolean[] czero = new boolean[colsize]; 
        for(int i=0;i<size;i++){
            for(int j=0;j<colsize;j++){            
            if(matrix[i][j]==0){
              rzero[i]=true;
              czero[j]=true;
                }
            }
            }
            for(int i=0;i<size;i++){
                for(int j=0;j<colsize;j++){
                    if(rzero[i] || czero[j]){
                        matrix[i][j]=0;
                    }
                }
            }
            }
        }