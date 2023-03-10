class Solution {
    public boolean checkBox(int row, int col, char[][] board){
        Set<Character> set = new HashSet<>();
        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }
        return true;
    }
    
    public boolean isValidSudoku(char[][] board) {
        // row check
        for(int i=0; i<board.length; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }
        
        // col check
        for(int i=0; i<board.length; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<board[0].length; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }
        }
        
        // 3*3 box check
        for(int i=0; i<board.length; i=i+3){
            for(int j=0; j<board[0].length; j=j+3){
                if(!checkBox(i, j, board))
                    return false;
            }
        }
        
        return true;
    }
}