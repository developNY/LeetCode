class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] ss = new int[26];
        int[] tt = new int[26];
        
        for(int i=0; i<s.length(); i++){
            ss[s.charAt(i)-'a']++;
            tt[t.charAt(i)-'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(ss[i] != tt[i])
                return false;
        }
        return true;
    }
}