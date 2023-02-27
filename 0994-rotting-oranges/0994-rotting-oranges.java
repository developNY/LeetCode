class Solution {
    public int orangesRotting(int[][] grid) {
        // This can be solved using BFS. Basically, to find out the max depth to which BFS can go, where at each depth, the adjacent oranges can be rotten. Note that if there are multiple components, we need to find if there are any rotten oranges. Hence to begin with, we will consider all existing rotten oranges. 
        Queue<int[]> q = new LinkedList<>();
        int total = 0;
        // Initially, traverse the whole grid and find out which ones are rotten
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int current = grid[i][j];
                if (current == 1 || current  == 2) total ++;
                if (current == 2) {
                    int[]a = new int[2];
                    a[0] = i;
                    a[1] = j;
                    q.add(a);
                }
            }
        }

        int current = 0;
        // Now perform BFS
        int depth = 0;
        while (!q.isEmpty()) {
            
            int len = q.size();
            current += len;
            if (current == total) return depth;
            depth++;
            for (int i = 0; i < len; i++) {
                int[]a = q.remove();

                int x = a[0];
                int y = a[1];
                // Top
                if (x > 0 && grid[x-1][y] == 1) {
                    grid[x-1][y] = 2;
                    int[]b = new int[2];
                    b[0] = x-1;
                    b[1] = y;
                    q.add(b);
                }

                // Left
                if (y > 0 && grid[x][y-1] == 1) {
                    grid[x][y-1] = 2;
                    int[]b = new int[2];
                    b[0] = x;
                    b[1] = y-1;
                    q.add(b);
                }

                // Bottom
                if (x < grid.length - 1 && grid[x+1][y] == 1) {
                    grid[x+1][y] = 2;
                    int[]b = new int[2];
                    b[0] = x+1;
                    b[1] = y;
                    q.add(b);
                }

                // Right
                if (y < grid[0].length - 1 && grid[x][y+1] == 1) {
                    grid[x][y+1] = 2;
                    int[]b = new int[2];
                    b[0] = x;
                    b[1] = y+1;
                    q.add(b);
                }
            }
        }

        // Now find out if there is any organe left that's not rotten
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return depth;
    }
}