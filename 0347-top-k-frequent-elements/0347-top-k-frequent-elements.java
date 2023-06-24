class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> reverse = new HashMap<>();

        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(!reverse.containsKey(e.getValue()))
                reverse.put(e.getValue(), new ArrayList<>());
            reverse.get(e.getValue()).add(e.getKey());
        }
        Object[] reverseKeys = reverse.keySet().toArray();
        Arrays.sort(reverseKeys, Collections.reverseOrder());

        int idx = 0;
        for(Object i : reverseKeys){
            if(idx >= k)
                break;
            List<Integer> list = reverse.get((int)i);
            for(int e : list)
                result[idx++] = e;
        }

        return result;
    }
}