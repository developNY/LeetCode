class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int matrixLen = matrix[0].length * matrix.length;
        int l = 0;
        int r = matrixLen-1;
        while(l <= r){
            int mid = (l + r) / 2;
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            int cur = matrix[row][col];

            if(cur == target)
                return true;
            else if(cur > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}