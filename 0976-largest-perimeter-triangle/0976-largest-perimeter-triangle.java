class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =n-1; i>=2; i--) {
            if(nums[i] < nums[i-1] + nums[i-2]) {
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-2; i++){
        //     int a = nums[i];
        //     int b = nums[i+1];
        //     int c = nums[i+2];
        //     if(a+b>c)
        //         return a+b+c;
        // }
        // return 0;
    }
}