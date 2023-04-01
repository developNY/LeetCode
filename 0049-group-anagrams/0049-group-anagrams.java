class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            StringBuilder sb = new StringBuilder();
            
            for(char c : str.toCharArray())
                arr[c-'a']++;
            
            for(int i : arr){
                sb.append("#");
                sb.append(i);
            }
            
            if(!map.containsKey(sb.toString()))
                map.put(sb.toString(), new ArrayList());
            map.get(sb.toString()).add(str);
        }
        
        return new ArrayList(map.values());
    }
}