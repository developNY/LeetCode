class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int a = nums[i];
                int l=i+1, r=nums.length-1;

                while(l < r){
                    int sum = a + nums[l] + nums[r];
                    if(sum == 0){
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(a);
                        tmp.add(nums[l]);
                        tmp.add(nums[r]);
                        ans.add(tmp);
                        while (l < r && nums[l] == nums[l + 1]) {
                                l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) {
                            r--;
                        }
                        l++; r--;
                    }else if(sum > 0){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }

        return ans;

    }
}