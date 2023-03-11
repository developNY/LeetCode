class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        
        for(int i=0; i<m; i++)
            arr[i][0] = 1;
        
        for(int i=0; i<n; i++)
            arr[0][i] = 1;
        
        for(int row=1; row<m; row++){
            for(int col=1; col<n; col++)
                arr[row][col] = arr[row-1][col] + arr[row][col-1];
        }
        return arr[m-1][n-1];
    }
}