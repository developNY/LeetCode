class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int fst=0; fst<nums.length-2; fst++){
            if(fst-1 >= 0 && nums[fst] == nums[fst-1])
                continue;
            int l = fst+1;
            int r = nums.length-1;
            
            while(l<r){               
                int sum = nums[fst]+nums[l]+nums[r];
                if(sum == 0){
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[fst]);
                    tmp.add(nums[l]);
                    tmp.add(nums[r]);
                    result.add(tmp);
                    while(l<r && nums[l] == nums[l+1])
                        l++;
                    while(l<r && nums[r] == nums[r-1])
                        r--;
                    l++;r--;
                }else if(sum < 0)
                    l++;
                else
                    r--;
            }
        }
        
        return result;
    }
}