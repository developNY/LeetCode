class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        
        for(int i : set){
            if(!set.contains(i-1)){
                int cnt = 1;
                while(set.contains(i+1)){
                    cnt++; i++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}