class Solution {
    public void colorDFS(int[][] image, int row, int col, int color, int start){
        if(row < 0 || row >= image.length)
            return;
        if(col < 0 || col >= image[0].length)
            return;
        if(image[row][col] != start)
            return;
        image[row][col] = color;
        colorDFS(image, row+1, col, color, start);
        colorDFS(image, row, col+1, color, start);
        colorDFS(image, row, col-1, color, start);
        colorDFS(image, row-1, col, color, start);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color)
            colorDFS(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}