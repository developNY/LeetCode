class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for(int i=0; i<s.length(); i++){
            int end = i+1;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            while(end < s.length()){
                char c = s.charAt(end);
                if(set.contains(c)){
                    i = s.indexOf(c, i);
                    break;
                }
                set.add(c);
                end++;
            }
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}