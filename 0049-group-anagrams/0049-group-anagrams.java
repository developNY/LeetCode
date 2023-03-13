class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        for(String str : strs){
            int[] tmp = new int[26];
            for(char c : str.toCharArray()){
                tmp[c-'a']++;
            }
        
            StringBuilder sb = new StringBuilder();
            for(int i : tmp){
                sb.append('#');
                sb.append(i);
            }
            if(!map.containsKey(sb.toString()))
                map.put(sb.toString(), new ArrayList());
            map.get(sb.toString()).add(str);
        }
        return new ArrayList(map.values());
    }
}