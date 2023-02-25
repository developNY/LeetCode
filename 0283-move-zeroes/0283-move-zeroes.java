class Solution {
    public void moveZeroes(int[] nums) {
        int zerocnt = 0;
        int nonzeroidx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                zerocnt++;
            else
                nums[nonzeroidx++] = nums[i];
        }
        for(int i=nums.length-zerocnt; i<nums.length; i++)
            nums[i] = 0;
    }
}