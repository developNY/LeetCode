class Solution {
    public String tictactoe(int[][] moves) {
        int[] row = new int[3];
        int[] col = new int[3];
        int diagonal1 = 0;
        int diagonal2 = 0;
        int player = 1;
        
        for(int[] move : moves){
            int r = move[0];
            int c = move[1];
            
            row[r] += player;
            col[c] += player;
            
            if(r == c)
                diagonal1 += player;
            if(r+c == 2)
                diagonal2 += player;
            
            if(Math.abs(row[r]) == 3 || Math.abs(col[c]) == 3 || Math.abs(diagonal1) == 3 || Math.abs(diagonal2) == 3 )
                return player == 1 ? "A" : "B";
            
            player *= -1;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}