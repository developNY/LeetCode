class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        for(int i=0; i<s.length(); i++){
            int end = i+1;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            while(end < s.length()){
                if(set.contains(s.charAt(end)))
                    break;
                set.add(s.charAt(end));
                end++;
            }
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}