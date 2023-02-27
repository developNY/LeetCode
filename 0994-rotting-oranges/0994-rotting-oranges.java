class Solution {  
    int[][] grid = null;
    boolean[][] visited = null;
    Queue<List<Integer>> queue = new LinkedList<>();
    
    public void rotten(int row, int col){
        if(row<0 || row>= grid.length || col<0 || col>= grid[0].length || visited[row][col] || grid[row][col] == 0)
            return;
        
        if(grid[row][col] == 1 && !visited[row][col]){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(row);
            tmp.add(col);
            queue.add(tmp);
            grid[row][col] = 2;
            visited[row][col] = true;
        }
    }
    
    public int orangesRotting(int[][] grid) {
        int res = 0;
        int row = grid.length, col = grid[0].length;
        this.grid = grid;
        this.visited = new boolean[row][col];
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 2){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    queue.add(tmp);
                    visited[i][j] = true;
                }
            }
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                List<Integer> tmp = queue.poll();
                int tmpRow = tmp.get(0);
                int tmpCol = tmp.get(1);
                
                rotten(tmpRow+1, tmpCol);
                rotten(tmpRow-1, tmpCol);
                rotten(tmpRow, tmpCol+1);
                rotten(tmpRow, tmpCol-1);
            }
            res++;
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        
        return res == 0? 0 : res-1;
    }
}