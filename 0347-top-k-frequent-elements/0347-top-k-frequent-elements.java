class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];                
        
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);

        for (int key : map.keySet()){
            int freq = map.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int val : bucket[i]){
                    res[index++] = val;
                    if(index == k)
                        return res;
                }
        return res;
    }
}