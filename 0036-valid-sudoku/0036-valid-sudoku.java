class Solution {
    public boolean isValidBox(char[][] board, int i, int j){
        Set<Character> set = new HashSet<>();
        for(int ii=i; ii<i+3; ii++){
            for(int jj=j; jj<j+3; jj++){
                if(board[ii][jj] != '.'){
                    if(set.contains(board[ii][jj]))
                        return false;
                    set.add(board[ii][jj]);
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board[0].length; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<board.length; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            }
        }

        for(int i=0; i<board[0].length; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            }
        }

        for(int i=0; i<board[0].length; i=i+3){
            for(int j=0; j<board.length; j=j+3)
                if(!isValidBox(board, i, j))
                    return false;
        }

        return true;
    }
}