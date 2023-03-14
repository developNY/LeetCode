class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <2)
            return s.length();
        
        int max = 1;
        
        for(int i=0; i<=s.length()-2; i++){
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j=i+1; j<s.length(); j++){
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
                max = Math.max(max, j-i+1);
            }
        }
        return max;
    }
}