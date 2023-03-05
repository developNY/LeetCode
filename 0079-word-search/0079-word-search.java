class Solution {
	public boolean dfs(int row, int col, int wordidx, char[][] board, String word, boolean[][] visited) {        
		if(wordidx >= word.length())
            return true;
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(wordidx) )
			return false;         
            
		//if(wordInd == word.length() - 1){ return true; }
		
        visited[row][col] = true;                                                                // mark it as visited now     
        
		if(dfs(row+1, col, wordidx+1, board, word, visited))
            return true;
        if(dfs(row-1, col, wordidx+1, board, word, visited))
            return true;
        if(dfs(row, col+1, wordidx+1, board, word, visited))
            return true;
        if(dfs(row, col-1, wordidx+1, board, word, visited))
            return true;
		
		
		visited[row][col] = false;
		return false;
	}
    
    public boolean exist(char[][] board, String word) {
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(dfs(i, j, 0, board, word, new boolean[board.length][board[0].length]))                                                   return true;
			}
		}
		return false;    
	}
}