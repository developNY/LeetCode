class Solution {
    public void dfs(int row, int col, int[][] heights, boolean[][] ocean, int depth){
        if(row < 0 || row >= heights.length || col < 0 || col >= heights[0].length || ocean[row][col] == true || heights[row][col] < depth)
            return;
        ocean[row][col] = true;
        dfs(row+1, col, heights, ocean, heights[row][col]);
        dfs(row-1, col, heights, ocean, heights[row][col]);
        dfs(row, col+1, heights, ocean, heights[row][col]);
        dfs(row, col-1, heights, ocean, heights[row][col]);
    }
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        
        int row = heights.length, col = heights[0].length;
        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];
        
        for(int i=0; i<col; i++){
            dfs(0, i, heights, pacific, heights[0][i]);
            dfs(row-1, i, heights, atlantic, heights[row-1][i]);
        }
        
        for(int i=0; i<row; i++){
            dfs(i, 0, heights, pacific, heights[i][0]);
            dfs(i, col-1, heights, atlantic, heights[i][col-1]);
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    res.add(tmp);
                }
            }
        }
        
        return res;
    }
}