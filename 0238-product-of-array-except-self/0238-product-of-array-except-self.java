class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        int total = 1;
        
        for(int i=0; i<nums.length-1; i++){
            total *= nums[i];
            res[i+1] = total;
        }
        
        total = 1;
        
        for(int i=nums.length-1; i>0; i--){
            total *= nums[i];
            res[i-1] *= total; 
        }
        
        return res;
    }
}