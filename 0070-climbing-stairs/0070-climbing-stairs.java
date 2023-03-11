class Solution {
     int[] arr = null;
    
    public void dp(int n, int curr){
        if(curr == n || curr == n-1)
            arr[curr] = 1;
        else
            arr[curr] = arr[curr+1] + arr[curr+2];
        if(curr == 0)
            return;
        dp(n, curr-1);
    }
    
    public int climbStairs(int n) {
        arr = new int[n+1];
        dp(n, n);
        return arr[0];
    }
}