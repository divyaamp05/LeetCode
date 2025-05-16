class Solution {
    public boolean canPartitionGrid(int[][] grid) {

        long ts=0;
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ts+=grid[i][j];
            }
        }
        long rs=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                rs+=grid[i][j];
            }
            if(2*rs==ts){
                return true;
            }
        }
        long cs=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                cs+=grid[j][i];
            }
            if(2*cs==ts){
                return true;
            }
        }

        return false;
    }
}