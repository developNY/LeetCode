class Solution {
	public boolean exist(char[][] board, String word) {
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
				if(dfsBoard(board, new boolean[board.length][board[0].length], r, c, word, 0)){                                               return true;
				}
			}
		}
		return false;                                                                             // if we traveresed all chars of board, it means we did not find all chars of word. so return false
	}
	// ----------------------------------------------------------------------------------------------------------------------------------------------- //
	public boolean dfsBoard(char[][] board, boolean[][] visitedBoard, int row, int col, String word, int wordInd) {        			
		if( (row < 0 || row >= board.length)   ||   (col < 0 || col >= board[0].length)  ||   board[row][col] != word.charAt(wordInd) ){
			return false;                                                                             // return false, if:  a)  row or col goes out of bound.  b) char in board != char in word 
		}
		if(visitedBoard[row][col] ){ return false; }                                                  // this element already visited, so don't do DFS on this
		if(wordInd == word.length() - 1){ return true; }
		visitedBoard[row][col] = true;                                                                // mark it as visited now             
			
		if( dfsBoard(board, visitedBoard, row, col-1, word, wordInd + 1) ){ return true; }            // DFS on Left
		if( dfsBoard(board, visitedBoard, row, col+1, word, wordInd + 1) ){ return true; }            // DFS on Right
		if( dfsBoard(board, visitedBoard, row-1, col, word, wordInd + 1) ){ return true; }            // DFS on ABove
		if( dfsBoard(board, visitedBoard, row+1, col, word, wordInd + 1) ){ return true; }            // DFS on Below
		visitedBoard[row][col] = false;
		return false;
	}
}