public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        int l = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int r=0; r<s.length(); r++){
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0)+1);
            
            if(map.get(c)>1){
                while(map.get(c) != 1){
                    char c2 = s.charAt(l);
                    map.put(c2, map.get(c2)-1);
                    l++;
                }
            }
            
            maxlen = Math.max(maxlen, r-l+1);
        }
        
        return maxlen;
    }
}