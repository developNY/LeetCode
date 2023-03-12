class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0|| coins.length == 0 || coins == null)
            return 0;
        
        int[] dp = new int[amount+1];
        
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        
        for(int amt=1; amt<=amount; amt++){
            for(int coin : coins){
                if(amt-coin >= 0)
                    dp[amt] = Math.min(dp[amt], 1+dp[amt-coin]);
            }
        }
        return dp[amount] != amount+1 ? dp[amount] : -1;
    }
}