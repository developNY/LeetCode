class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] alphabet = new int[26];
            for(char c : str.toCharArray())
                alphabet[c - 'a']++;

            StringBuilder result = new StringBuilder();
            for(int i : alphabet)
                result.append(i).append('.');
            
            String resultStr = result.toString();
            
            if(!map.containsKey(resultStr))
                map.put(resultStr, new ArrayList<String>());
            map.get(resultStr).add(str);
        }
        return new ArrayList(map.values());
    }
}